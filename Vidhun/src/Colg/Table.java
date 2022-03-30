package Colg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> column3 = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement col3 : column3)
		{
		System.out.println(col3.getText());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		List<WebElement> col2 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for(WebElement clg2:col2)
		{
			System.out.println(clg2 .getText());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
		List<WebElement> col1= driver.findElements(By.xpath("//table/tbody/tr[35]/td[3]"));
		for(WebElement clg1:col1)
		{
			System.out.println(clg1.getText());
		}
		List<WebElement> col4= driver.findElements(By.xpath("//table/tbody/tr[37]/td[2]"));
		for (WebElement clg4 : col4)
		{
			System.out.println(clg4.getText());
		}
	}

}
