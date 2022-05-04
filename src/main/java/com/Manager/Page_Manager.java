package com.Manager;

import org.openqa.selenium.WebDriver;

import com.Pom.Book_Hotel;
import com.Pom.Hotel_Search;
import com.Pom.Log_Out;
import com.Pom.Login_Page;
import com.Pom.Search_Hotel;

public class Page_Manager {

	public WebDriver driver;
	private Login_Page lp;
	
	public Page_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Login_Page getInstanceLogin() {
		if(lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	
	private Hotel_Search hs;
	
	public Hotel_Search getHotelSearch() {
		if(hs == null) {
			hs = new Hotel_Search(driver);
		}
		return hs;
	}
	
	private Search_Hotel sh;	
	public Search_Hotel getSelectHotel() {
		if(sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;	
	}
	
	private Book_Hotel bh;
	public Book_Hotel getBookHotel() {
		if(bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}
	
	private Log_Out lo;
	public Log_Out getLogOut() {
		if(lo == null) {
			lo = new Log_Out(driver);
		}
		return lo;	
	}

}
