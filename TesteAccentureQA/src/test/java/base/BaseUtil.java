package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {
	public static WebDriver createChrome() {
		//Abrindo Navegador
		String cwd = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", cwd +"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");

		return driver;
	}

}