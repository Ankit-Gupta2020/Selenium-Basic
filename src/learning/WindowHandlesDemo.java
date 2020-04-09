package learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo 
{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String originalWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("adb")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		if(allWindows.size()==2)
		{
			for(String windowHandle :allWindows)
			{
				if(windowHandle .equals(originalWindow))
				{
					driver.switchTo().window(windowHandle);
				}
			}
		}
		
		
		driver.close();
		driver.switchTo().window(originalWindow);
		driver.quit();
	}
}
