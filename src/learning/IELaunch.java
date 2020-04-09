package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IELaunch {

	public static void main(String[] args) 
	{

		//System.setProperty("webdriver.firefox.marionette","C:\\Projects\\libs\\drivers\\geckodriver.exe");
		/*FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);*/
		/*DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Projects\\libs\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		

	}

}
