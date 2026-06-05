package POM_Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {
	
	WebDriver driver;
	
	public POM(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By registerbtn=By.linkText("Register");
	By radiobtn=By.id("gender-male");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By cnfpass=By.id("ConfirmPassword");
	By regisbtn=By.id("register-button");
	By continuebtn=By.xpath("//input[@class=\"button-1 register-continue-button\"]");
	
	By logoutbtn=By.linkText("Log out");
	
	By loginbtn=By.linkText("Log in");
	By mail=By.id("Email");
	By pass=By.id("Password");
	By log=By.xpath("//input[@class=\"button-1 login-button\"]");
	
	public void regis() {
		
		driver.findElement(registerbtn).click();
		driver.findElement(radiobtn).click();
		driver.findElement(firstname).sendKeys("Sowmithran");
		driver.findElement(lastname).sendKeys("V");
		driver.findElement(email).sendKeys("sowmithranvhtestingabcd@gmail.com");
		driver.findElement(password).sendKeys("Sowmithran@24");
		driver.findElement(cnfpass).sendKeys("Sowmithran@24");
		driver.findElement(regisbtn).click();
		driver.findElement(continuebtn).click();
		
	}
	
	public void logout() {
		
		driver.findElement(logoutbtn).click();
	}
   
	public void login() {
		
		driver.findElement(loginbtn).click();
		
		driver.findElement(mail).sendKeys("muzzuu@gmail.com");
		
		driver.findElement(pass).sendKeys("Sowmithran@24");
		
		driver.findElement(log).click();
	}
}
