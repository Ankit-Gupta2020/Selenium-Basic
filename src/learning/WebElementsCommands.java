package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands 
{

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//1. How to open a URL in browser
		driver.navigate().to("http://www.DemoQA.com");
		 
		
		//1. clear --> If this element is a text entry element, this will clear the value. INPUT TEXTAREA 
		
		//2. click ..> Element must be visible and it must have a height and width greater then 0.
		
		//3. findElement(By by) --> Find the first WebElement using the given method.
		
		//4. findElements(By by) --> Find all elements within the current context using the given mechanism
		
		//5. getAttribute(java.lang.String name) --> Get the value of the given attribute of the element. e.g. title
		
		//6. getCssValue(java.lang.String propertyName) --> Get the value of a given CSS property.
		
		//7. getTagName() --> Get the tag name of this element
		
		//8. getText() --> Get the visible (i.e. not hidden by CSS) text of this element, including sub-elements
		
		//9. isDisplayed() -- > visible on page.
		
		//10. isEnabled() --> Is the element currently enabled or not? This will generally return true for everything but disabled input elements.
		
		//11. isSelected() --> checkboxes , options in a select and radio buttons
		
		//12. sendKeys(java.lang.CharSequence... keysToSend)
		
		//13. submit 
		 
		// Close only the current window the WebDriver is currently controlling 
		driver.close();
		
		// Closes all windows
		//driver.quit();
		
	}

}
