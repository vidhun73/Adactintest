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
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	//	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=5788450789887017751&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061950&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=Cj0KCQiA0p2QBhDvARIsAACSOOMBinC5RxfEroh9SBlRj53MaoSDR0wVe6x58TU_uqu76Dvsd1DwJUsaAm5OEALw_wcB");
		
		Actions ac = new Actions (driver);
//		WebElement email= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		email.sendKeys("vidhunhell@gmail.com");
//		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
//		pass.sendKeys("73firerider");
	WebElement login= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
////		WebElement all=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
//		all.click();
//		WebElement electronics=driver.findElement(By.xpath("//a[@data-menu-id='9']"));
//		electronics.click();
//		Thread.sleep(2000);
//		WebElement dslr=driver.findElement(By.xpath("//a[text()='DSLR Cameras']"));
//		dslr.click();
//		Thread.sleep(1000);
		login.click();
		WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		ac.moveToElement(Electronics).build().perform();
		WebElement cameras= driver.findElement(By.xpath("//*[contains(text(),'Cameras')]"));
		ac.moveToElement(cameras).build().perform();
		Thread.sleep(3000);
		WebElement  dslr=driver.findElement(By.xpath("//*[contains(text(),'DSLR')]"));
		ac.moveToElement(dslr).build().perform();
		Thread.sleep(3000);
		dslr.click();
		Thread.sleep(1000);
		TakesScreenshot sr = (TakesScreenshot)driver;
		File sc= sr.getScreenshotAs(OutputType.FILE);
		File loc= new File("C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\Screenshot\\action2.png");
		FileUtils.copyFileToDirectory(sc, loc);
		
		
		
		System.out.println("done");
	}

}
