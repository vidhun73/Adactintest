package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.switchTo().frame("singleframe");
	WebElement single = driver.findElement(By.xpath("//input[@type='text']"));
	single.sendKeys("bosoco");
	System.out.println("@@@@@@@@@@@@@@@@");
	driver.switchTo().defaultContent();
	WebElement nestedFrameBtn  = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe'] "));
	nestedFrameBtn.click();
	WebElement outterframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outterframe);
	WebElement innerframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);
	WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("vidhun");
	
}
}