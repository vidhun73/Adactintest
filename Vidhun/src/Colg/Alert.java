package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
//	private static org.openqa.selenium.Alert alert;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement alertbox = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	alertbox.click();
 org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.accept();
	WebElement alertwithok = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel']"));
    alertwithok.click();
    WebElement alerwithokbtn= driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
   alerwithokbtn.click();
    driver.switchTo().alert().accept();
   WebElement alerwithtext= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
   alerwithtext.click();
   WebElement alertwithbtnok=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
   alertwithbtnok.click();
   
   org.openqa.selenium.Alert proAlert= driver.switchTo().alert();
   proAlert.sendKeys("vidhun");
   
   
	
	
	
	}

}
