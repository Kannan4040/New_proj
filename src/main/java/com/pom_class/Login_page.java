package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public static WebDriver driver;

	@FindBy(name ="username")
	private WebElement username;
	
	@FindBy(name ="password")
	private WebElement password;
	
	@FindBy(name ="login")
	private WebElement log;

	public Login_page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return log;
	}

}
