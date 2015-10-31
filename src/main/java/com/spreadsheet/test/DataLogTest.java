package com.spreadsheet.test;

import java.sql.Date;
import java.sql.Timestamp;



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
		
		
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = 
		     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String currentTime = sdf.format(dt);
		
		dataLog.setTime(dt);
		
		User u = userServices.findUserSheetById(1);
		
		dataLog.setUserdataLog(u);
		
		
		dataLogServices.saveData(dataLog);
		
		
		
		
		
	}

}
