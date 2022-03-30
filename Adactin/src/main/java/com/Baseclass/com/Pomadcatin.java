package com.Baseclass.com;

import java.util.jar.Attributes.Name;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Pomadcatin {
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	public Element getusername() {
		return Username;
	}
	public Element getpasswords() {
		return Passwords;
	}
	public Element getlogin() {
		return Login;
	}
	@FindBy (name="username")
	private Element Username;

   @FindBy(name ="passwords")
   private Element Passwords;
   
   @FindBy(id="login")
   private Element Login;
   

		

	}
	
	

