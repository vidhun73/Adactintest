package Colg;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Normaltetsing {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		ChromeOptions value= new ChromeOptions();
		value.addArguments("--incognito");
		value.addArguments("--Start-Maximized");
		WebDriver driver= new ChromeDriver(value);
		driver.get("http://automationpractice.com/index.php");
		Actions rc = new Actions(driver);
		Thread.sleep(1500);
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		rc.moveToElement(women).build().perform();
		Thread.sleep(1500);
		WebElement casual =driver.findElement(By.cssSelector("[title^='Casual Dresses']"));
		rc.moveToElement(casual).build().perform();		
		casual.click();
		Thread.sleep(1500);
		WebElement size = driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_2']"));
		size.click();	
		WebElement dress= driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",dress);
		dress.click();
		Thread.sleep(1000);
		WebElement fram = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(fram);
		WebElement cart=driver.findElement(By.xpath("//button[@class='exclusive']"));
		cart.click(); 
	 //   Thread.sleep(1000);
	 //   WebElement pro = driver.findElement(By.xpath("(//div[@class='clearfix'])[1]"));
	   // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement process= driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    process.click();
	
	
//	    Alert alert = driver.switchTo().alert();
//	alert 
//	
//	
	
	
	
	
	
//		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
//			ChromeOptions value= new ChromeOptions();
//			value.addArguments("--incognito");
//			value.addArguments("--Start-Maximized");
//			WebDriver driver= new ChromeDriver(value);
//			JavascriptExecutor js= (JavascriptExecutor) driver;
//			driver.get("http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0#account-creation");
////			WebElement process= driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
////			//driver.switchTo().frame(process);
////			process.click();
////			WebElement process2= driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
////			WebDriverWait wait = new WebDriverWait(driver, 10);
////			wait.until(ExpectedConditions.visibilityOf(process2));
////			process2.click();
//			WebElement email= driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]"));
//			js.executeScript("window.scrollBy(0,500)",email);
//			WebDriverWait wait2 = new WebDriverWait(driver, 20);
//			wait2.until(ExpectedConditions.visibilityOf(email));
//			email.sendKeys("vidhunhell@gmail.com");
//			WebElement password = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]"));
//			password.sendKeys("73firerider");
//			WebElement creat= driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
//			creat.click();
//			WebElement process3 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
//			process3.click();
//			WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
//			checkbox.click();
//			WebElement click2 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
//			click2.click();
//			TakesScreenshot rs = (TakesScreenshot)driver;
//			File ss = rs.getScreenshotAs(OutputType.FILE);
//			File location= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\mini.png");
//			FileUtils.copyFileToDirectory(ss, location);
//		
//			WebElement gender =driver.findElement(By.xpath("div.radio"));
//			gender.click();
//		    js.executeScript("window.scrollBy(0,200)", "");
			
			
		//	driver.switchTo().frame(name);
//			WebElement name = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[1]"));
//			driver.switchTo().frame(name);
//			name.sendKeys("vidhun");
//			WebElement secondname= driver.findElement(By.id("customer_lastname"));
//			secondname.sendKeys("ck");
//			WebElement passwd= driver.findElement(By.name("passwd"));
//			passwd.sendKeys("12345689");
//			WebElement days= driver.findElement(By.name("days"));
//			Select date= new  Select(days);
//			date.selectByVisibleText("4");		
			
			
			System.out.println("done");

		
		
		
		
		
		
		
		
		
		
		}

}
