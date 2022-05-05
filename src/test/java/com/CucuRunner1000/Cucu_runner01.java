package com.CucuRunner1000;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Goo.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Prop1000",
glue="com\\Stepdef1000",
plugin = {"html:jio"})

public class Cucu_runner01 {
		
	public static WebDriver driver;
	
	@BeforeClass
	public static void Step01() {
  
		 driver=BaseClass.browserlaunch("chrome");
		
	}
	@AfterClass
	public static void step_down() {

		BaseClass.browserClose();
	}
	
				
	}

	
	


