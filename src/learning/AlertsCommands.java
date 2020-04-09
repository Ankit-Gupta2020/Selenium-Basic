package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCommands 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		Alert alert=driver.switchTo().alert();		
		
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("abc");
		driver.manage().window().maximize();
	}
}
