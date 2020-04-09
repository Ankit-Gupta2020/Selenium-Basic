package learning;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import org.apache.commons.io.FileUtils;

public class TakeScreenShotMethod 
{

	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		File destFile=new File("C:\\Workspace_Study\\Selenium-Basic\\ScreenShot.png");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile,destFile);
		
		
		//Get Full Page ScreenShot
		//Ashot API
		
		File fullPage=new File("C:\\Workspace_Study\\Selenium-Basic\\Fullpage.jpg");
		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver); 
		ImageIO.write(screenshot.getImage(),"jpg",fullPage);
		driver.quit();
		
	}
}
