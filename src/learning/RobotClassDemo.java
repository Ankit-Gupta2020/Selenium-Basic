	package learning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo 
{

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/selenium-webdriver/robot-class/");
		driver.manage().deleteAllCookies();
		
		//import java.awt.Robot;
		//Robot rb = new Robot();
		//rb.methodname()
		
		Robot rb = new Robot();
		
		//rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		//rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);
		
		//rb.mouseMove(30, 40);
		
		//rb.delay(100000);
		rb.mouseWheel(300);
		System.out.println("ROBOT CLASSS");
	}
}
