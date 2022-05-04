package com.Maven_Project3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.File_Ex.File_Reading;
import com.Manager.Page_Manager;

public class Runner extends Base_Case {
	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Manager pom = new Page_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_Reading.getInstanceFRM(). getInstanceCR().getUrl();
		urlLaunch(url);
		
		String username = File_Reading.getInstanceFRM().getInstanceCR().getusername();
		textInput(pom.getInstanceLogin().getUsername(), username);
		
		String password = File_Reading.getInstanceFRM().getInstanceCR().getPassword();
		textInput(pom.getInstanceLogin().getPassword(), password);
		
		clickOnElement(pom.getInstanceLogin().getLogin());
		
		dropDown(pom.getHotelSearch().getLocation(), "London");
		dropDown(pom.getHotelSearch().getHotels(), "Hotel Sunshine");
		dropDown(pom.getHotelSearch().getRoom_type(), "Double");
		dropDown(pom.getHotelSearch().getRoom_nos(), "4");
		dropDown(pom.getHotelSearch().getAdult_room(), "2");
		dropDown(pom.getHotelSearch().getChild_room(), "1");
		clickOnElement(pom.getHotelSearch().getSubmit());
		
		clickOnElement(pom.getSelectHotel().getRadiobutton_0());
		clickOnElement(pom.getSelectHotel().getContinue());
		
		String firstname = File_Reading.getInstanceFRM().getInstanceCR().getFirstname();
		textInput(pom.getBookHotel().getFirst_name(), firstname);
		
		String lastname = File_Reading.getInstanceFRM().getInstanceCR().getLastname();
		textInput(pom.getBookHotel().getLast_name(), lastname);
		
		String address = File_Reading.getInstanceFRM().getInstanceCR().getaddress();
		textInput(pom.getBookHotel().getAddress(), address);
		
		String accountNum = File_Reading.getInstanceFRM().getInstanceCR().getAccountnum();
		textInput(pom.getBookHotel().getCc_num(), accountNum);
		
		dropDown(pom.getBookHotel().getCc_type(), "MAST");
		dropDown(pom.getBookHotel().getCc_exp_month(), "5");
		dropDown(pom.getBookHotel().getCc_exp_year(), "2019");
		
		String Cvv = File_Reading.getInstanceFRM().getInstanceCR().getCvv();
		textInput(pom.getBookHotel().getCc_cvv(), Cvv);
		
clickOnElement(pom.getBookHotel().getBook_now());
		
		waitSleep();
		
		clickOnElement(pom.getLogOut().getLogout());
		
		screenShots("C:\\Users\\dhinesh\\Maven\\Maven_Project2\\Screenshot\\logout.png");
	}
		
	
}
