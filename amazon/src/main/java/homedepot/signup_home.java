package homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup_home {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement enteremail;
	@FindBy(id="password-input-field")
	WebElement password;
	@FindBy(id="zipCode")
	WebElement zip;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(linkText = "Create an Account")
	WebElement create;
	
	public signup_home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	public void enteremail (String em ) {
		enteremail.sendKeys(em);
		
	}
	public void password (String pa) { 
		password.sendKeys(pa);
	}
	public void zip (String zi) {
		zip.sendKeys(zi);
		}
	public void create() {
		create.click();
	}
	
}
	

