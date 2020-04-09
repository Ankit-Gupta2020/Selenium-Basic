package learning;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventsFiringClass {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		
		//following is to disable infobars (disable-infobars) is now deprecated use following
		/*
		 * options.setExperimentalOption("useAutomationExtension", false);
		 * options.setExperimentalOption("excludeSwitches",Collections.singletonList(
		 * "enable-automation"));
		 */
		
		//options.addArguments("--headless");
		WebDriver driver1 = new ChromeDriver(options);
		
		EventFiringWebDriver driver = new EventFiringWebDriver(driver1);
		WebEventsListenerClass eventListener = new WebEventsListenerClass();
		driver.register(eventListener);
		
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		WebElement element = driver.findElement(By.cssSelector("#button1"));
		element.click();
		driver.quit();

	}

}
