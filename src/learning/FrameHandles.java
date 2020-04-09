package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandles {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		
		WebElement frameWebElement=driver.findElement(By.xpath("AAA"));
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("FrameName");
		driver.switchTo().frame(frameWebElement);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.manage().window().maximize();
	}

}
