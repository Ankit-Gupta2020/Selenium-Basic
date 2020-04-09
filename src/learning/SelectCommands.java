package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCommands 
{

	WebDriver driver = new ChromeDriver();
	WebElement element = driver.findElement(By.xpath(""));
	Select oselect = new Select(element);
	
	Select oSelect = new Select(driver.findElement(By.id("Country")));
	
	//selectByVisibleText
	//selectByIndex
	//selectByValue
	
	
	//getOptions
	//getFirstSelectedOption
	//getAllSelectedOptions
	
	//isMultiple
	//deselectByVisibleText
	//deselectByIndex
	//deselectByValue
	//deselectAll
	
}
