package pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CadastrarEnterProductData {
	private WebDriver driver;	
	public  CadastrarEnterProductData(WebDriver driver) {
		this.driver = driver;
	}
	//aba EnterProductData
	public CadastrarEnterProductData preencherCamposUmAbaTres(String startdate) {
		driver.findElement(By.id("startdate")).sendKeys(Keys.chord(startdate));
		return this;
	}
	
	public CadastrarEnterProductData escolherInsurance (String insurancesum )	{
		WebElement campoInsurance  = driver.findElement(By.id("insurancesum"));
		new Select(campoInsurance ).selectByVisibleText(insurancesum);
		return this;
	}
	
	public CadastrarEnterProductData escolhermeritrating (String meritrating )	{
		WebElement campomeritrating  = driver.findElement(By.id("meritrating"));
		new Select(campomeritrating ).selectByVisibleText(meritrating);
		return this;
	}
	
	public CadastrarEnterProductData escolherdamageinsurance (String damageinsurance )	{
		WebElement campodamageinsurance  = driver.findElement(By.id("damageinsurance"));
		new Select(campodamageinsurance ).selectByVisibleText(damageinsurance);
		return this;
	}
	
	public CadastrarEnterProductData escolherEuroProtection(String EuroProtection, String LegalDefenseInsurance) {
		if(EuroProtection.equalsIgnoreCase("Yes")) {
			driver.findElement(By.xpath("//*[@id=\"EuroProtection\"]")).click();
				
		}
		if(LegalDefenseInsurance.equalsIgnoreCase("Yes")) {
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span")).click();	
		}
		
		return this;
	}
	
	public CadastrarEnterProductData escolherCourtesycar (String courtesycar )	{
		WebElement campocourtesycar  = driver.findElement(By.id("courtesycar"));
		new Select(campocourtesycar ).selectByVisibleText(courtesycar);
		
		driver.findElement(By.id("nextselectpriceoption")).click();
		return this;
	}
	
	public CadastrarSelectPriceOption preencherAbaEnterProductData (String startdate,String insurancesum, String meritrating, String damageinsurance, String EuroProtection, String LegalDefenseInsurance, String courtesycar ) {
		try {
		preencherCamposUmAbaTres(startdate);
		escolherInsurance (insurancesum);
		escolhermeritrating (meritrating );
		escolherdamageinsurance (damageinsurance );
		escolherEuroProtection(EuroProtection,LegalDefenseInsurance);
		escolherCourtesycar (courtesycar );
		}catch (Exception ex) {
			fail("Aba Enter Product Data não foi preenchida corretamente");
		}
		return new CadastrarSelectPriceOption(driver);
				
		}

}