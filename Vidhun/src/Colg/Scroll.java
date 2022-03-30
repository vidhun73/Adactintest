package Colg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(2000);		
		js.executeScript("window.scrollBy(0,1500)", "");
		Thread.sleep(1500);
		WebElement face= driver.findElement(By.xpath("//a[text()='Facebook']"));
		js.executeScript("arguments[0].scrollIntoView();", face);
		face.click();
		System.out.println("done");
		TakesScreenshot screen= (TakesScreenshot)driver;
	  File scr = screen.getScreenshotAs(OutputType.FILE);
	  File loc= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\scroll.png");
	  FileUtils.copyFileToDirectory(scr, loc);
	
	
	}

}
