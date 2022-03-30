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

public class Irctc {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement ok=driver.findElement(By.xpath("//button[@type='submit']"));//button[@type='submit']
		ok.click();
		TakesScreenshot s= (TakesScreenshot)driver;
		File ss= s.getScreenshotAs(OutputType.FILE);
		File location= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\irctc.png");
		FileUtils.copyFileToDirectory(ss, location);
		
		
	}

}
