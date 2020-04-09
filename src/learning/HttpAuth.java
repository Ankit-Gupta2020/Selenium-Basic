package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpAuth 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://guru99:guru99@demo.guru99.com/test/basic_auth.php");
		driver.switchTo().alert().sendKeys("guru99");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("guru99");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
