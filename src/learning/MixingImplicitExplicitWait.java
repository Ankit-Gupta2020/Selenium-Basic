package learning;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MixingImplicitExplicitWait 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		System.out.println("Wait starts --- > " + new Date());
		
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("abc")));
		}
		catch (TimeoutException e) {
			// TODO: handle exception
		}
		
		System.out.println("Wait Ends ----> " + new Date());
		driver.quit();
		
	}
}
