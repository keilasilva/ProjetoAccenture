package pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CadastrarEnterInsurantData {
	private WebDriver driver;	
	public  CadastrarEnterInsurantData(WebDriver driver) {
		this.driver = driver;
	}
	
	// aba EnterInsurantData
			public CadastrarEnterInsurantData preencherCamposUmAbaDois(String firstname, String lastname, String birthdate, String streetaddress) {
				driver.findElement(By.id("firstname")).sendKeys(Keys.chord(firstname));
				driver.findElement(By.id("lastname")).sendKeys(Keys.chord(lastname));
				driver.findElement(By.id("birthdate")).sendKeys(Keys.chord(birthdate));		
				driver.findElement(By.id("streetaddress")).sendKeys(Keys.chord(streetaddress));
				return this;
			}
			
			public CadastrarEnterInsurantData escolherGender(String gender) {
				if (gender == "F") {
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
				}else 
					driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
					
			return this;
			}
				public CadastrarEnterInsurantData escolherCountry(String country)	{
					WebElement campoCountry = 	driver.findElement(By.id("country"));
					new Select(campoCountry).selectByVisibleText(country);
					return this;
				}
				public CadastrarEnterInsurantData preencherCamposDoisAbaDois(String zipcode, String city) {
				driver.findElement(By.id("zipcode")).sendKeys(Keys.chord(zipcode));
				driver.findElement(By.id("city")).sendKeys(Keys.chord(city));
				return this;
				}
				public CadastrarEnterInsurantData escolherOccupation(String occupation)	{
					WebElement campoOccupation = driver.findElement(By.id("occupation"));
					new Select(campoOccupation).selectByVisibleText(occupation);
					return this;
				}
				public CadastrarEnterInsurantData preencherCamposTresAbaDois(String speeding,String bungeejumping, String cliffdiving,String skydiving, String other) {
							
					if(speeding.equalsIgnoreCase("Yes")) {
						driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
							
					}
					if(bungeejumping.equalsIgnoreCase("Yes")) {
						driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();	
					}
					if(cliffdiving.equalsIgnoreCase("Yes")) {
						driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();	
					}
					if(skydiving.equalsIgnoreCase("Yes")) {
						driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();	
					}
					if(other.equalsIgnoreCase("Yes")) {
						driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")).click();	
					}
					

				driver.findElement(By.id("nextenterproductdata")).click();
				return this;
		}
				public CadastrarEnterProductData preencherEnterInsurantData(String firstname, String lastname, String birthdate, String streetaddress,String gender, String country, String zipcode, String city,String occupation,String speeding,String bungeejumping,String cliffdiving, String skydiving,String other) {
					try {
					preencherCamposUmAbaDois(firstname, lastname, birthdate, streetaddress);
					escolherGender (gender);
					escolherCountry(country);
					preencherCamposDoisAbaDois(zipcode, city);
					escolherOccupation( occupation);
					preencherCamposTresAbaDois (speeding, bungeejumping, cliffdiving, skydiving, other);
					}catch (Exception ex) {
						fail("Aba Enter Insurant Data não foi preenchida corretamente");
					}
					return new CadastrarEnterProductData(driver);
							
					}

			}

					
				
