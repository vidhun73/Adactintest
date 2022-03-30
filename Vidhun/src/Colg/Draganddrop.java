package Colg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement drag= driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		Thread.sleep(1000);
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions rc = new Actions(driver);
		rc.dragAndDrop(drag, drop).build().perform();
		System.out.println("done");
		
	}

}
