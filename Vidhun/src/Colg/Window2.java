package Colg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

//import org.openqa.grid.web.servlet.Grid1HeartbeatServlet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement clcik=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clcik.click();
		WebElement offers= driver.findElement(By.xpath("//div[@class='eFQ30H']"));
		Actions a = new Actions(driver);
		Robot b = new Robot();
		a.contextClick(offers).build().perform();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement grow = driver.findElement(By.xpath("//div[@class='eFQ30H'][2]"));
		a.contextClick(grow).build().perform();
		b.keyPress(KeyEvent.VK_DOWN); 
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobile= driver.findElement(By.xpath("//div[@class='eFQ30H'][3]"));
		a.contextClick(mobile).build().perform();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
	String pr = driver.getWindowHandle();
	Set<String>all = driver.getWindowHandles();
	for(String id : all)
	{
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
	}
	String mobiles = "Mobile Phones Online at Best Prices in India";
	for(String id : all)
	{
		if(driver.switchTo().window(id).getTitle().equals(mobiles))
			
		{
			break;
		}
		System.out.println("done");
}
	}
}
	
	

	
	
	

		
		
	
