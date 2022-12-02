package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	WebDriver driver= RunnerClass.driver;
	
	@Given("^userlanch the adactin application$")
	public void userlanch_the_adactin_application() throws Throwable {
	    

		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter the Username in Username field$")
	public void user_Enter_the_Username_in_Username_field() throws Throwable {
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("RajaStark");
	}

	@When("^user Enter the password in Password field$")
	public void user_Enter_the_password_in_Password_field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
	   
	  
	}

	@Then("^user Click the Login Button and it Navigates to Search Hotel Page$")
	public void user_Click_the_Login_Button_and_it_Navigates_to_Search_Hotel_Page() throws Throwable {
	    
	    driver.findElement(By.xpath("//input[@id='login']")).click();
	}

	@When("^user select the Location from Select Location Dropdown$")
	public void user_select_the_Location_from_Select_Location_Dropdown() throws Throwable {
	   
	   WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
	   
	  Select sc = new Select(location);
	  sc.selectByVisibleText("Brisbane");
	   
	}

	@When("^user select the Hotel from Select Hotel Dropdown$")
	public void user_select_the_Hotel_from_Select_Hotel_Dropdown() throws Throwable {
	   
	   WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
	   
	   Select sc = new Select(hotels);
	   sc.selectByVisibleText("Hotel Sunshine");  
	   
	}

//	@When("^user select the Room Type from Select Room Type Dropdown$")
	//public void user_select_the_Room_Type_from_Select_Room_Type_Dropdown() throws Throwable {
	 //  driver.findElement(By.xpath("//select[@id='room_type']"));
	//Select sc= new Select(typeofroom);
	//sc.selectByVisibleText("Deluxe");
	
	//}

	//@When("^user select the Number of Rooms from Select Number of Rooms Dropdown$")
	//public void user_select_the_Number_of_Rooms_from_Select_Number_of_Rooms_Dropdown() throws Throwable {
	    
	   
	//}

	//@When("^user enter the Check In Date in the Check In Date field$")
	public void user_enter_the_Check_In_Date_in_the_Check_In_Date_field() throws Throwable {
	    
	   
	}

	@When("^user enter the Check Out Date in the Check Out Date field$")
	public void user_enter_the_Check_Out_Date_in_the_Check_Out_Date_field() throws Throwable {
	    
	    
	}

	@When("^user select Number of Adults per Room from Select Adults per Room Dropdown$")
	public void user_select_Number_of_Adults_per_Room_from_Select_Adults_per_Room_Dropdown() throws Throwable {
	    
	    
	}

	@When("^user select Number of Children per Room from Select Children per Room Dropdown$")
	public void user_select_Number_of_Children_per_Room_from_Select_Children_per_Room_Dropdown() throws Throwable {
	    
	   
	}

	@Then("^user click the search Button And It Navigates to Search  Hotel Continue Page$")
	public void user_click_the_search_Button_And_It_Navigates_to_Search_Hotel_Continue_Page() throws Throwable {
	    
	   
	}

	@When("^user click the select Button$")
	public void user_click_the_select_Button() throws Throwable {
	   
	    
	}

	@Then("^user click the continue Button And It Navigates to Book a Hotel Page$")
	public void user_click_the_continue_Button_And_It_Navigates_to_Book_a_Hotel_Page() throws Throwable {
	    
	 
	}

	@When("^user enter First Name in First Name field$")
	public void user_enter_First_Name_in_First_Name_field() throws Throwable {
	    
	   
	}

	@When("^user enter Last Name in Last Name field$")
	public void user_enter_Last_Name_in_Last_Name_field() throws Throwable {
	   
	   
	}

	@When("^user enter the Address in Billing Address field$")
	public void user_enter_the_Address_in_Billing_Address_field() throws Throwable {
	   
	   
	}

	@When("^user enter Credit card No in Credit Card No Field$")
	public void user_enter_Credit_card_No_in_Credit_Card_No_Field() throws Throwable {
	   
	   
	}

	@When("^user select the card type from Select Credit Card Type Dropdown$")
	public void user_select_the_card_type_from_Select_Credit_Card_Type_Dropdown() throws Throwable {
	    
	    
	}

	@When("^user select Expiry month from select Month Dropdown$")
	public void user_select_Expiry_month_from_select_Month_Dropdown() throws Throwable {

	   
	}

	@When("^user Select Expiry year from Select yesr Dropdown$")
	public void user_Select_Expiry_year_from_Select_yesr_Dropdown() throws Throwable {
	   
	  
	}

	@When("^user enter CVV Number in CVV Number field$")
	public void user_enter_CVV_Number_in_CVV_Number_field() throws Throwable {
	    
	    
	}

	@Then("^user click Book Now Button And It Navigates to Booking Confirmation Page$")
	public void user_click_Book_Now_Button_And_It_Navigates_to_Booking_Confirmation_Page() throws Throwable {
	    
	    
	}

	@Then("^user click Logout Button And It navigates to Logout Page$")
	public void user_click_Logout_Button_And_It_navigates_to_Logout_Page() throws Throwable {
	    
	    
	}



}
