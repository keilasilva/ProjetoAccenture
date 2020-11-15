package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ValidarMensagem {
	private WebDriver driver;	
	public  ValidarMensagem(WebDriver driver) {
		this.driver = driver;
	}
	public ValidarMensagem validaMensagens() {
		try {
		assertEquals("Sending e-mail success!", driver.findElement(By.cssSelector("h2")).getText());
	    assertEquals("OK", driver.findElement(By.cssSelector("button.confirm")).getText());
	    driver.findElement(By.cssSelector("button.confirm")).click();
	  
		}catch (Exception ex) {
			fail("Mensagem não foi exibida");
		}
		return null;
	}
}
