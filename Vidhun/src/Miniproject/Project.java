package Miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Project {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	   System .setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\driversss\\chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--Incognito");
	   options.addArguments("--Start-maximized");
	   options.addArguments("--disable-popup-blocking");
	   WebDriver driver = new ChromeDriver(options);
	   driver.get("http://automationpractice.com/index.php");
	   WebElement mystore=driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]")); 
	   Actions move = new Actions(driver);
	   move.contextClick(mystore).build().perform();
	   Robot rc = new Robot();
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   rc.keyPress(KeyEvent.VK_DOWN);
	   rc.keyRelease(KeyEvent.VK_DOWN);
	   rc.keyPress(KeyEvent.VK_ENTER);
	   rc.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(2500);
	   String pr = driver.getWindowHandle();
		Set<String>all = driver.getWindowHandles();
		for(String id : all)
		{
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}		   
       WebElement women= driver.findElement(By.xpath("//a[@title='Women']")); 
	   move.moveToElement(women).build().perform();
	   Thread.sleep(2500);
	 
	   WebElement summar = driver.findElement(By.xpath("//a[@title='Summer Dresses']"));
	  move.moveToElement(summar).build().perform();
	  Thread.sleep(2500); 
	  summar.click();
	
	  WebElement dress = driver.findElement(By.xpath("(//div[@class='product-container'])[2]"));
	 move.moveToElement(dress).build().perform();
	 Thread.sleep(1000);
	 
	 WebElement select= driver.findElement(By.xpath("(//a[@class='product-name'])[3]"));
	 js.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(1000);
	select.click();
	 Thread.sleep(1000);
	 
	 WebElement addcart = driver.findElement(By.name("Submit"));
	 move.moveToElement(addcart).build().perform();
	 Thread.sleep(1000);
	 addcart.click();
	 Thread.sleep(2000);
	 
	 WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	 js.executeScript("window.scrollBy(0,350)", "");
	 proceed.click();
	 Thread.sleep(2000);
	 
	 WebElement proceed2= driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	 js.executeScript("window.scrollBy(0,250)", "");
	 proceed2.click();
	 Thread.sleep(2000);
	 
	 WebElement email= driver.findElement(By.cssSelector("input#email"));
	 js.executeScript("window.scrollBy(0,250)", "");
	 email.sendKeys("vidhunhell@gmail.com");
	 Thread.sleep(1500);
	 
	 WebElement pass = driver.findElement(By.cssSelector("input#passwd"));
	 pass.sendKeys("73firerider");
	 boolean display=pass.isDisplayed();
	 System.out.println(display);
	
	 driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	Thread.sleep(1500);
	WebElement checkout = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	move.moveToElement(checkout).build().perform();
	checkout.click();
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	js.executeScript("window.scrollBy(0,250)", "");
	checkbox.click();
	
 WebElement stdcheck=driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
 js.executeScript("window.scrollBy(0,350)","");
 stdcheck.click();
 
 js.executeScript("window.scrollBy(0,250)", "");
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 
 
 TakesScreenshot ss = (TakesScreenshot)driver;
 File source=ss.getScreenshotAs(OutputType.FILE);
 File loc= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\mini.png");
 FileUtils.copyFileToDirectory(source, loc);
	 
	   
	   
	   
	  
	   
	   
	System.out.println("completed");
	
	
	
	
	
	}

}
