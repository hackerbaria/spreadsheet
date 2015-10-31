package com.spreadsheet.test;

import java.util.Date;

import com.spreadsheet.model.DataLog;
import com.spreadsheet.model.User;
import com.spreadsheet.services.DataLogServices;
import com.spreadsheet.services.UserServices;

public class DataLogTest {

	
	public static void main(String[] args) {
		DataLogServices dataLogServices = new DataLogServices();
		UserServices userServices = new UserServices();
		
		
		DataLog dataLog = new DataLog();
		dataLog.setColumn("B");
		dataLog.setRow(3);
		dataLog.setData("Ngoc Su Ty");
		dataLog.setTime(new Date());
		
		User u = userServices.findUserSheetById(1);
		
		dataLog.setUserdataLog(u);
		
		
		dataLogServices.saveData(dataLog);
		
		
		
		
		
	}

}
