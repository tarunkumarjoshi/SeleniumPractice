package webDriver;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws Exception, ElementNotSelectableException {
		String driversPath = "C:\\Tarun\\Selenium\\Drivers\\";
		System.setProperty("webdriver.chrome.driver", driversPath+"chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", driversPath+"geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", driversPath+"IEDriverServer.exe");
		
		WebDriver driverChrome = new ChromeDriver();
		System.out.println("Starting to launch browser");
		driverChrome.get("https://www.toolsqa.com/automation-practice-form/");
		
		/*WebDriver driverFF = new FirefoxDriver();
		driverFF.get("http://www.google.com");
		
		WebDriver driverIE = new InternetExplorerDriver();
		driverIE.get("http://www.google.com");*/
		
		System.out.println("Browser Launch Succesful");
	}
}

