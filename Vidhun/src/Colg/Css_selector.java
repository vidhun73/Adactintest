package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("vidhunhell@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[id='pass']"));
		password.sendKeys("654761641");
		WebElement clcik= driver.findElement(By.cssSelector("div._6ltg"));
		clcik.click();
	}

}
