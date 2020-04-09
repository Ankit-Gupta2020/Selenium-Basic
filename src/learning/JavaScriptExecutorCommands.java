package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*1. Click on WebElement:
	js.executeScript("arguments[0].click();", WebElement);

2. Navigating to different page
	js.executeScript("window.location = 'https://www.google.com'");
	
3. Refresh Browser
	js.executeScript("history.go(0)");

4. Get Title
	js.executeScript(" return document.title;").toString();

5. Get CurrentURL
	js.executeScript(" return document.URL;").toString();

6. SendKeys:
	element is locating by id
		js.executeScript("document.getElementsById('some id')[0].value='SomeValue';");
		js.executeScript("document.getElementsByName('some name')[0].value='SomeValue';");

7. Generating alert Pop-up:
	js.executeScript("alert('Alert messages');");
	
8. Check page is ready:
	js.executeScript("return document.readyState").toString().equals("complete");

9. Get Browser info
	js.executeScript("return navigator.userAgent;").toString();

10. Scroll down till  element is visible
	js.executeScript("arguments[0].scrollIntoView(true);",WebElement);

11. Scroll down the web page at the bottom of the page
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	
12. Scroll by x-pixel and y-pixel
	js.executeScript("window.scrollBy(0,500)");
	

13. Get Domain Name of Site
	js.executeScript(" return document.domain;").toString();*/



public class JavaScriptExecutorCommands 
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location='http://agni:23381';");
		js.executeScript("document.getElementsByName('username')[0].value='TestAdmin';");
		js.executeScript("document.getElementsByName('password')[0].value='Password1';");
		
		WebElement loginButton = driver.findElement(By.cssSelector("input[value=Login]"));
		
		js.executeScript("arguments[0].click();", loginButton);
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='System']"))).
		moveToElement(driver.findElement(By.xpath("//a[text()='Environment']"))).click().perform();
		
		WebElement ele = driver.findElement(By.xpath("//td[text()='no_proxy']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		  long start_time=System.currentTimeMillis(); Thread.sleep(5000); long
		  end_time=System.currentTimeMillis();
		  
		  System.out.println((end_time-start_time)/1000L);
		  
		  //js.executeScript("alert('Hello Ankit');");
		  js.executeScript("history.go(0)");
		 
	}
}
