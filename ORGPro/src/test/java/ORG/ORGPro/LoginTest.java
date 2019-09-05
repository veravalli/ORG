package ORG.ORGPro;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	
	WebDriver driver;
  
	@Test
  public void f() {
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
  }
  
	@BeforeTest
  public void BLanuch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium softwares 2019\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
  }

}
