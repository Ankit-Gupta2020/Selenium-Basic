package learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinks 
{

	
	public static List<WebElement> GetAllLinks(WebDriver driver)
	{
		
		List<WebElement> element1 = driver.findElements(By.tagName("a"));
		
		List<WebElement> element2 = driver.findElements(By.tagName("img"));
		
		List<WebElement> finalElements = new ArrayList<WebElement>();
		element1.addAll(element2);
		
		
		for(WebElement element : element1)
		{
			if(element.getAttribute("href")!=null)
			{
				finalElements.add(element);
			}
		}
		
		return finalElements;
	}
	
	public static String IsLinkBroken(URL url) throws IOException
	{
		String response="";
		String statusCode="";
		HttpURLConnection connection =(HttpURLConnection)url.openConnection();
		try
		{
			connection.connect();
			response = connection.getResponseMessage();
			statusCode=String.valueOf(connection.getResponseCode());
			connection.disconnect();
			return "Response is "+ response + " and Response code is " + statusCode;
		}
		catch(Exception e)
		{
			
			return e.getMessage();
		}
		
			
	}
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://guru99.com/");
		
		List<WebElement> allLinks = GetAllLinks(driver);
		
		for(WebElement element:allLinks)
		{
			try
			{
				 System.out.println("URL: " + element.getAttribute("href")+ " returned " + IsLinkBroken(new URL(element.getAttribute("href"))));
			}catch(Exception e)
			{
				
				System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + e.getMessage());      
			}
		}
		driver.quit();
	}
	
	
}
