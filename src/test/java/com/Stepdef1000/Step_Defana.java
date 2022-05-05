package com.Stepdef1000;

import java.io.IOException;

import com.Goo.BaseClass;
import com.prop.File_read_manager;

import Pom_Manager.Pom_Man1;
import io.cucumber.java.en.When;

public class Step_Defana extends BaseClass{
	
	public static Pom_Man1 po = new Pom_Man1(driver);
	@io.cucumber.java.en.Given("user Must Launch The Url")
	public void user_must_launch_the_url() throws IOException {
		String urr1000 = File_read_manager.getinfrm().getincr().urllanc();
		urllaunch(urr1000);
		
		
		
		




	   
	}
	@io.cucumber.java.en.When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() throws IOException {
		String username1000 = File_read_manager.getinfrm().getincr().username10();
		passinput(po.gtlog().getUsername(),username1000);
			
	    
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() throws IOException {
		String pass1000 = File_read_manager.getinfrm().getincr().pass100();
		passinput(po.gtlog().getPassword(),pass1000);
	    
	}
	@io.cucumber.java.en.Then("user Click The Login button and It Navigates To The Search Hotel Page")
	public void user_click_the_login_button_and_it_navigates_to_the_search_hotel_page() {
		clickonElement(po.gtlog().getLogin());

	}

}
