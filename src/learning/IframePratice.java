package learning;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePratice 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/iframe-practice-page/");
		
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		
		System.out.println(elements.size());
		
		for(WebElement element:elements)
		{
			String frameName=element.getAttribute("name");
			driver.switchTo().frame(frameName);
			driver.switchTo().defaultContent();
		}
		
		driver.quit();
		
	}
}
