package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCommands {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(""));
		
		//following are mouse actions
		action.click();
		action.click(element);
		
		action.doubleClick();
		action.doubleClick(element);
		
		
		action.contextClick();
		action.contextClick(element);
		
		action.moveToElement(element);
		
		action.clickAndHold();
		action.clickAndHold(element);
		
		action.dragAndDrop(element, element);
		action.dragAndDropBy(element, 10, 20);	
		
		
		//modifier keys  : Keys.SHIFT Keys.ALT Keys.CONTROl
		//keyDown(element,keys)
		action.keyDown(Keys.CONTROL);
		action.keyDown(element, Keys.CONTROL);
		
		action.keyUp(Keys.CONTROL);
		action.keyUp(element, Keys.CONTROL);
		
		action.sendKeys(Keys.CONTROL);
		action.sendKeys(element,Keys.CONTROL);

	}

}
