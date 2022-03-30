package Colg;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhun ck\\eclipse-workspace\\Vidhun\\drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("--ignore-certificate-error");
		option.addArguments("--Start-Maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
	
System.out.println("done");	
	}

}
