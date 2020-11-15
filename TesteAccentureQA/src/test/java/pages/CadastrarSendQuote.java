package pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class CadastrarSendQuote {
	private WebDriver driver;	
	public  CadastrarSendQuote(WebDriver driver) {
		this.driver = driver;
	}
	public CadastrarSendQuote preencherAbaSendQuote(String email, String phone, String username, String password, String confirmpassword) {
		try {
		driver.findElement(By.id("email")).sendKeys(Keys.chord(email));
		driver.findElement(By.id("phone")).sendKeys(Keys.chord(phone));
		driver.findElement(By.id("username")).sendKeys(Keys.chord(username));
		driver.findElement(By.id("password")).sendKeys(Keys.chord(password));
		driver.findElement(By.id("confirmpassword")).sendKeys(Keys.chord(confirmpassword));
		driver.findElement(By.id("sendemail")).click();
		}catch (Exception ex) {
			fail("Aba Send Quote não foi preenchida corretamente");
		}
		return this;
				
		}

}
