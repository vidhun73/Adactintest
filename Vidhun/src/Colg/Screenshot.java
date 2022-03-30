package Colg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
//private static final String FileUtil= null;

//	private static final String FileUtils = null;

     public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("vidhunck@yahoo.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
		WebElement sign=driver.findElement(By.name("login"));
		sign.click();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File scr= ts.getScreenshotAs(OutputType.FILE);
		File filelocation= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\facebooklogin.png");
		FileUtils.copyFileToDirectory(scr, filelocation);		
		}

}
