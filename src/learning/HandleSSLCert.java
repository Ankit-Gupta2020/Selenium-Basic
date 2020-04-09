package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLCert 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\drivers\\libs\\chromedriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.acceptInsecureCerts();
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://cacert.org/");
		
		
		FirefoxProfile  profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		
		DesiredCapabilities capab= DesiredCapabilities.internetExplorer();
		capab.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	}
	
}
