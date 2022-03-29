package com.stepdefine.com;

import org.openqa.selenium.WebElement;

import com.Baseclass.com.Mini_baseclass;

public class Adactinstepdefine extends Mini_baseclass{
 
	public static WebElement driver;
	
	public static void main(String[] args) {
		
		browserlaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
	}
}
