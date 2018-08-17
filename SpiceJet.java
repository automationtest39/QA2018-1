package facebook_test;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Programme\\Selenium\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		//driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();;
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByValue("USD");	
		s1.selectByVisibleText("AED");
		s1.selectByIndex(1);
		s1.selectByIndex(3);
		
		
		//Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		//s2.selectByValue("BKK");
		
		/*
		WebElement webElem = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1"));
		new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(webElem));
		webElem.click();		
		Select s3 = new Select(webElem);
		s3.selectByValue("AMD");
		*/
		
		/*
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		*/
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		

	}

}
