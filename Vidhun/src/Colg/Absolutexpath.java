package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
	WebDriver drs =new ChromeDriver();
	drs.manage().window().maximize();
	//drs.get("https://www.facebook.com/");
	drs.get("https://demo.guru99.com/test/selenium-xpath.html");
	//WebElement sap=drs.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
	WebElement sap= drs.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul[2]/li[2]/a"));
	sap.click();
//	sap.sendKeys("vidhunck@gmail.com");
//	WebElement sap1=drs.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
//	sap1.sendKeys("123456789");
//	WebElement sap2=drs.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button"));
//	sap2.click();
	drs.close();
System.out.println("done");
}
}