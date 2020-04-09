package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands 
{

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//1. How to open a URL in browser
		driver.navigate().to("http://www.DemoQA.com");
		 
		
		//2. Forward
		 driver.navigate().forward();
		 
		 //3. backward
		 driver.navigate().back();
		 
		 //4. refresh
		 driver.navigate().refresh();
		 
		// Close only the current window the WebDriver is currently controlling 
		driver.close();
		
		// Closes all windows
		//driver.quit();
		
	}

}
