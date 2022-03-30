package Colg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_c {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		WebElement phone = driver.findElement(By.xpath("//input[@type='text']"));
		phone.sendKeys("iphone 12");
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		click.click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeAsyncScript("argument[2].scrollIntoView();", phone);
	    WebDriverWait hold = new WebDriverWait(driver, 30);
	    hold.until(ExpectedConditions.visibilityOf(phone));
	    System.out.println("done");
	}

}
