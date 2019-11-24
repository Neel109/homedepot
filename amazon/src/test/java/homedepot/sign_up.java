package homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class sign_up {
	WebDriver driver;
	
	@Test

	public void signup() {
		signup_home us = new signup_home (driver);
		us.enteremail("myemail");
		us.password("password");
		us.zip("23230");
		us.create.click();
	}
		
		
	
	
	@BeforeClass
	public void beforeclass () throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelc\\eclipse-workspace\\new_automation\\Drivers\\chromedriver.exe");
	  
	   driver=new ChromeDriver();
	   driver.navigate().to("https://homedepot.com");
	   driver.manage().window().maximize();
	   driver.findElement(By.className("MyAccount__button")).click();
	   Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span")).click();
	
	}
}

