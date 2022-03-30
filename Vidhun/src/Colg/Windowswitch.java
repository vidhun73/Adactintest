package Colg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Windowswitch {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	WebElement women = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
	Actions rc =new Actions(driver);
	rc.contextClick(women).build().perform();
	Robot rs= new Robot();
	rs.keyPress(KeyEvent.VK_DOWN);
	rs.keyRelease(KeyEvent.VK_DOWN);
	rs.keyPress(KeyEvent.VK_ENTER);
	rs.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement dress = driver.findElement(By.xpath("//a[text()='Dresses']"));
	rc.contextClick(dress).build().perform();
//	rs.keyPress(KeyEvent.VK_KP_DOWN);
	rs.keyPress(KeyEvent.VK_DOWN);
	rs.keyRelease(KeyEvent.VK_DOWN);
	rs.keyPress(KeyEvent.VK_ENTER);
	rs.keyRelease(KeyEvent.VK_ENTER);
	WebElement tshirt= driver.findElement(By.xpath("//a[text()='T-shirts']"));
	rc.contextClick(tshirt).build().perform();
	rs.keyPress(KeyEvent.VK_DOWN);
	rs.keyRelease(KeyEvent.VK_DOWN);
	rs.keyPress(KeyEvent.VK_ENTER);
	rs.keyRelease(KeyEvent.VK_ENTER);
	
//	String parent = driver.getWindowHandle();
//    Set<String>allwindow = driver.getWindowHandles();
//	for (String id : allwindow)
//{
//	String title = driver.switchTo().window(id).getTitle();
//	System.out.println(title);
//	}
	 
	String dresswindow= "Dresses - My Store";
	for(String id1 : allwindow)
{
		if(driver.switchTo().window(id1).getTitle().equals(dresswindow))
		{
			break;
		}
	}
	WebElement carts = driver.findElement(By.xpath("//div[@class='product-image-container']"));
	WebElement addcart= driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
	rc.moveToElement(carts).build().perform();
	addcart.click();
	Thread.sleep(1500);
	TakesScreenshot screen= (TakesScreenshot)driver;
	File ss= screen.getScreenshotAs(OutputType.FILE);
	File location= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\action.png");
	FileUtils.copyFileToDirectory(ss, location);
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	System.out.println("done");
}
}
