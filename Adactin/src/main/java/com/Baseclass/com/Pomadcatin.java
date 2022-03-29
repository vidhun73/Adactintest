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
	public Element getUsername() {
		return username;
	}
	public Element getPasswords() {
		return passwords;
	}
	public Element getLogin() {
		return login;
	}
	@FindBy (name="Username")
	private Element username;

   @FindBy(name ="Passwords")
   private Element passwords;
   @FindBy(id="Login")
   private Element login;
   

		

	}
	
	

