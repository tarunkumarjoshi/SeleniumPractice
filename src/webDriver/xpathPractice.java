package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractice {

	public static void main(String[] args) {
		String driversPath = "C:\\Users\\tkumar\\Documents\\Automation\\Practice\\eclipse-workspace\\SeleniumTraining\\drivers\\";
		System.setProperty("webdriver.chrome.driver", driversPath+"chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.toolsqa.com/automation-practice-form/");
		
		System.out.println("Test Case 1: Click the link - Partial Link Test");
		driverChrome.findElement(By.xpath("//strong[contains(text(),'Partial')]")).click();
		
		System.out.println("\nTest Case 2: Click the link - Link Test");
		driverChrome.findElement(By.xpath("//a[@title='Automation Practice Table']/strong[contains(text(),'Link Test')]")).click();;
		if (driverChrome.findElement(By.xpath("//div[@id='content']/h1[contains(text(),'Practice Table')]")).isDisplayed())
			System.out.println("PASS: 'Link Test' - Link click Successful");
		else
			System.out.println("FAIL: 'Link Test' - Link click Failed");
					
		System.out.println("\nTest Case 3: Fill Edit Boxes, Enter FName, LName");
		driverChrome.navigate().back();
		driverChrome.findElement(By.name("firstname")).sendKeys("Tarun");
		driverChrome.findElement(By.name("lastname")).sendKeys("Kumar");
		if (driverChrome.findElement(By.name("firstname")).getAttribute("value").equalsIgnoreCase("tarun") && driverChrome.findElement(By.name("lastname")).getAttribute("value").equalsIgnoreCase("kumar"))
			System.out.println("PASS: 'Edit Box Enter Text' - First Name and Last Name entered Successfully");
		else
			System.out.println("FAIL: 'Edit Box Enter Text' - First Name and Last Name entry Failed");
		
		System.out.println("\nTest Case 4: Select Radio Buttons - Sex, YOExp");
		
		
		System.out.println("\nTest Case 5: Select Checkboxes - Profession, Automation Tool");
		
		
		System.out.println("\nTest Case 6: Select Date - Date");

	}

}
