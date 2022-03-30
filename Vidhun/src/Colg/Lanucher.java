package Colg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver; 

public class Lanucher {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
				 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\geckodriver.exe" );
		
	//	WebDriver driver1= new FirefoxDriver();
		
//	driver1.get("https://www.youtube.com/");
		
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\msedgedriver.exe");
		
		
	//	WebDriver driver2 = new EdgeDriver();
		
	//	driver2.get("https://www.amazon.in/");
		
		String title= driver.getTitle();
		System.out.println(title);
		String currenturl= driver.getCurrentUrl();
				System.out.println(currenturl);
driver.manage().window().maximize();
driver.navigate().to("https://www.youtube.com/");
driver.navigate().to("https://github.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.close();
		
	}

}
