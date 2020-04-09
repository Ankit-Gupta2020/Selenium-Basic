package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButton 
{

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//1. How to open a URL in browser
		driver.navigate().to("http://www.DemoQA.com");
		 
		

		 
		// Close only the current window the WebDriver is currently controlling 
		driver.close();
		
		// Closes all windows
		//driver.quit();
		
	}

}
