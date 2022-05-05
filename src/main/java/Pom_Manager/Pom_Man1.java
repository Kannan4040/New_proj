package Pom_Manager;

import org.openqa.selenium.WebDriver;

import com.pom_class.Login_page;

public class Pom_Man1 {

	public WebDriver driver;
	
	private Login_page lp;
	
	public Pom_Man1(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login_page gtlog() {

		if (lp==null) {
			
		
		lp= new Login_page(driver);
		
		}
		return lp;
	}
	
	
	
	
}
