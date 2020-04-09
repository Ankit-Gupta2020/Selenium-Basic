package learning;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MixingImplicitExplicitWait2 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		System.out.println("Wait starts --- > " + new Date());
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("abc")));
		
		
		System.out.println("Wait Ends ----> " + new Date());
		driver.quit();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
		  .withTimeout(Duration.ofSeconds(30))
		  .pollingEvery(Duration.ofSeconds(5))
		  .ignoring(NoSuchElementException.class);

		WebElement foo = wait.until
		(
			new Function<WebDriver, WebElement>() 
				{
					public WebElement apply(WebDriver driver) 
					{
						return driver.findElement(By.id("foo"));
					}
				}
		);
		
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);

	
	}
}
