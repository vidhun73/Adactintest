package Colg;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rssss {
 public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
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
	
	System.out.println("done");
	
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=14535510811783000478&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061950&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiA9aKQBhBREiwAyGP5lfq3XryWsRm8Y4xErluWmbFi8HGsARjP-upP5g74kmrptw8ca0JE5hoCrpQQAvD_BwE");
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.click();
	rs.keyPress(KeyEvent.VK_SHIFT);
	rs.keyPress(KeyEvent.VK_C);
	rs.keyRelease(KeyEvent.VK_C);
	rs.keyPress(KeyEvent.VK_A);
	rs.keyRelease(KeyEvent.VK_A);
	rs.keyPress(KeyEvent.VK_M);
	rs.keyRelease(KeyEvent.VK_M);
	rs.keyPress(KeyEvent.VK_E);
	rs.keyRelease(KeyEvent.VK_E);
	rs.keyPress(KeyEvent.VK_R);
	rs.keyRelease(KeyEvent.VK_R);
	rs.keyPress(KeyEvent.VK_A);
	rs.keyRelease(KeyEvent.VK_A);
	rs.keyRelease(KeyEvent.VK_SHIFT);
	WebElement find=driver.findElement(By.id("nav-search-submit-button"));
	find.click();

 
 
 }
}
