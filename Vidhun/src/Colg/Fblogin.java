package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fblogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://login.yahoo.com/?.intl=us");
    	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//WebElement email =driver. findElement(By.id("login-username"));
	WebElement email =driver. findElement(By.id("email"));
	email.sendKeys("vidhunck@yahoo.com");
	//WebElement nextbtn = driver.findElement(By.name("signin"));
      //  nextbtn.click();
	//WebElement password= driver.findElement(By.name("password"));
	WebElement password= driver.findElement(By.id("pass"));
	password.sendKeys("73Firerider");
//	WebElement nextbtn1 = driver.findElement(By.name("verifyPassword"));
WebElement nextbtn1 = driver.findElement(By.name("login"));
	nextbtn1.click();
	
		
	}

}
