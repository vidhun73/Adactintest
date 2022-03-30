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

public class Xpath {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		email.sendKeys("vidhunck@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("123456789");
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		TakesScreenshot ss = (TakesScreenshot)driver;
		File scr=ss.getScreenshotAs(OutputType.FILE);
		File locationFile= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\rc.png");
		FileUtils.copyDirectory(scr, locationFile);
		
	}

}
   