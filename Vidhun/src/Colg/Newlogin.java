package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newlogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver ags = new ChromeDriver();
      
		ags.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		ags.manage().window().maximize();
		WebElement firstname= ags.findElement(By.id("firstName"));
		firstname.sendKeys("vidhun");
		WebElement secondname= ags.findElement(By.id("lastName"));
		 secondname.sendKeys("ck");
		 WebElement user=ags.findElement(By.id("username"));
	//	 user.sendKeys("bosco73");
	//	 user.clear();
		 user.sendKeys("vidhunck73");
		 WebElement password=ags.findElement(By.name("Passwd"));
		 password.sendKeys("12345678@f");
		 WebElement cnfpassword=ags.findElement(By.name("ConfirmPasswd"));
		 cnfpassword.sendKeys("12345678@f");
		 WebElement check=ags.findElement(By.id("selectioni1"));
		 check.click();
	//	 WebElement next=ags.findElement(By.id("accountDetailsNext"));
		// next.click();
		 WebElement next=ags.findElement(By.className("VfPpkd-vQzf8d"));
		 next.click();
	
		 
		 }

}
