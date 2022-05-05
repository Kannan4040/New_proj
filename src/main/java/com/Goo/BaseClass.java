package com.Goo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserlaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver100\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver100\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void urllaunch(String url) {

		driver.get(url);
	}

	public static void browserClose() {

		driver.close();
	}

	public static void passinput(WebElement element, String input) {

		element.sendKeys(input);

	}

	public static void clickonElement(WebElement element) {

		element.click();
	}
	
	public static void selectbyindex(WebElement element,int input) {

		Select ss = new Select(element);
		
		ss.selectByIndex(input);
		
	}
	
	public static void seletbyvalue(WebElement element,String input) {
		Select s2= new Select(element);
         s2.selectByValue(input);
	}
	
	
	public static void actionclass(WebElement element ) throws AWTException {
		

		
		Actions aa = new Actions(driver);

		aa.click().build().perform();

	
    Robot r = new Robot();

    
    r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);

	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	

	public static void dropdown(String type,WebElement element,String data) {
		
try {
	Select s= new Select(element);
	
	if (type.equalsIgnoreCase("byvalue")) {
		
	}else if (type.equalsIgnoreCase("bytext")) {
		
	}else if (type.equalsIgnoreCase("byindex")) {
		int index= Integer.parseInt(data);
				s.selectByIndex(index);
	}
	
} catch (Exception e) {
	e.printStackTrace();
}
	}
	public static void clear(WebElement element) {
element.clear();
	}
	public static  void browserwait(String type,WebElement element, long sec) {
type.equalsIgnoreCase("wait");
driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void impli1(int value) {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
