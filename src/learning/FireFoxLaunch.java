package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFoxLaunch {

	public static void main(String[] args) 
	{

		//System.setProperty("webdriver.firefox.marionette","C:\\Projects\\libs\\drivers\\geckodriver.exe");
		/*FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);*/
		/*DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Projects\\libs\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		

	}

}
