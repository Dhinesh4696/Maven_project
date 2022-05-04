package com.File_Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configure {
	public static Properties p;

	public Configure() throws Throwable {

		File f = new File(
				"C:\\Users\\dhinesh\\Maven\\Maven_Project3\\src\\main\\java\\com\\File_Ex\\Example.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUrl() throws Throwable {
		
		String url = p.getProperty("url");
		return url;
	}
	
	public String getusername() throws Throwable{
		 
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() throws Throwable {
		String password = p.getProperty("password");
		return password ;
		
	}
	
	public String  getFirstname() throws Throwable {
		String Firstname = p.getProperty("firstname");
		return Firstname;
		
	}
	
	public String getLastname() throws Throwable {
		String Lastname = p.getProperty("lastname");
		return Lastname;
		
	}
	
	public String getaddress() throws Throwable {
		String Address = p.getProperty("address");
		return Address;

	}
	
	public String getAccountnum() throws Throwable {
		String Accountnumber = p.getProperty("acc_num");
		return Accountnumber;
	}
	
	public String getCvv() throws Throwable {
			String Cvv = p.getProperty("cvv");
			return Cvv;
			
	}
}
