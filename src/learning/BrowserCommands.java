package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands 
{

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//1. How to open a URL in browser
		driver.get("https://www.google.com");
		
		//2. How to get currently opened URL in browser
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current URL is -->" + currentURL);
		
		//3. How to get page source of currently loaded page in browser
		String pageSource = driver.getPageSource();
		//System.out.println("Page source is " + pageSource);
		
		
		//4. How to get title of currently loaded page in browser
		String strTitle=driver.getTitle();
		System.out.println("Tiltle of browser is " + strTitle);
		
		System.out.println(driver.getClass().getSimpleName());
		
		//5. Close only the current window the WebDriver is currently controlling 
		//driver.close();
		
		//6. Closes all windows
		driver.quit();
		
	}

}
