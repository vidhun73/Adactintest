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
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://countrycode.org/");
		//driver.get("https://country-regions.github.io/country-region-selector/");
		 driver.manage().window().maximize();
		 WebElement SingleDropdown =driver.findElement(By.xpath("//span[@class='filter-option pull-left']"));
		// WebElement SingleDropdown =driver.findElement(By.xpath("//select[@data-value='shortcode']"));
		 Select r =new Select(SingleDropdown);
		 r.selectByVisibleText("India");
	//	((WebDriver) r).findElement(By.xpath("//span[@class='filter-option pull-left']"));
	//	r.selectByVisibleText("India")
		
	TakesScreenshot ps = (TakesScreenshot) driver;
	File frc = ps.getScreenshotAs(OutputType.FILE);
	File filelocation=new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\dropdown.png");
	FileUtils. copyFileToDirectory(frc, filelocation);
	
	
		System.out.println("done");
	}
}

