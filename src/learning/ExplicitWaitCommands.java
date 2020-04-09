package learning;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommands {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		//An explicit wait is code you define to wait for a certain 
		//condition to occur before proceeding further in the code.
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		boolean windows=false;
		
		try
		{
		windows=wait.until(ExpectedConditions.titleContains("Google1"));
		}catch (TimeoutException e) {
			
		}
		
		System.out.println(windows);
	/*	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("AAA")));
		
		Alert alert =wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("AAA")));*/
		
		
		
	}

}
