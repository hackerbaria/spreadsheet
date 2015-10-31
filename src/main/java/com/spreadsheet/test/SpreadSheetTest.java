package com.spreadsheet.test;

import com.spreadsheet.model.SpreadSheet;
import com.spreadsheet.model.User;
import com.spreadsheet.services.SpreadSheetServices;
import com.spreadsheet.services.UserServices;

public class SpreadSheetTest {
	public static void main(String[] args) {
		SpreadSheetServices spreadsheetServices = new SpreadSheetServices();
		
		
		SpreadSheet ss = new SpreadSheet();
		ss.setName("SpreadSheet1");
		
		
		UserServices services = new UserServices();
		User u = new User();
		u.setName("ngoc");
		u.setPassword("ngoc@123");
		User input = services.checkUser(u);		
		ss.setUser(input);
		
		spreadsheetServices.saveSpreadSheet(ss);
		
	}

}
