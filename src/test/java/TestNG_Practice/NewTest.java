package TestNG_Practice;

import org.testng.annotations.Test;

import POM_Implementation.POM;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	POM p;
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://demowebshop.tricentis.com/login");
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
 @Test
 public void Register() {
	 
	 p=new POM(driver);
	 
	 p.regis();
	 
	 p.logout();
	 
 }
 
 @Test
 public void Login() {
	 
	 p=new POM(driver);
	 
	 p.login();
	 
 }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
