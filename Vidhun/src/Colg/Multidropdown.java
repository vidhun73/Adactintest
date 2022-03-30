package Colg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement multidropDown = driver.findElement(By.xpath("(//select)[6]"));
		Select r= new Select(multidropDown);
		boolean multiple = r.isMultiple();		
		System.out.println(multiple);
		r.selectByValue("1");
		
		if(r.isMultiple()==true)
		{
			r.selectByValue("2");
			r.deselectByVisibleText("Loadrunner");
			r.selectByValue("3");
			
		}
		else
		{
			System.out.println("the selected dropdown is not");
		}
		System.out.println("each options");
		List<WebElement> allOptions=r.getOptions();
		for (WebElement option : allOptions)
		{
			System.out.println(option.getText());	
		}
Iterator<WebElement>iterator=allOptions.iterator();
while (iterator.hasNext()) 
{
System.out.println(iterator.next().getText());
}
System.out.println("all");
List<WebElement>allselectedoption=r.getAllSelectedOptions();
Iterator<WebElement>iterator2=allselectedoption.iterator();
while (iterator2.hasNext())
{
	System.out.println(iterator2.next().getText());
}
		WebElement firstselectedoption=r.getFirstSelectedOption();
		System.out.println(firstselectedoption.getText());
	}
	}
