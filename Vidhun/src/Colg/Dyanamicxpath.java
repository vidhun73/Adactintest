package Colg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.myntra.com/");
//		List<WebElement> home = driver.findElements(By.xpath("//a[text()='Men']//following::a[text()='Women']"));
//		//home.click();
//		for(WebElement vs : home) {
//			System.out.println(vs.getText());
//		}
	driver.get("https://www.myntra.com/shirts?f=Gender%3Amen%2Cmen%20women&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");
		List<WebElement> selected =driver.findElements(By.xpath("//span[@class='product-strike']//preceding::span[@class='product-discountedPrice']"));
	//	select.click();
		for(WebElement dr : selected)
		{
			System.out.println(dr.getText());
		}
	}

}
