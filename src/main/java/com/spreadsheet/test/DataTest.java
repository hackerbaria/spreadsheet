package com.spreadsheet.test;

import com.spreadsheet.model.Data;
import com.spreadsheet.model.SpreadSheet;
import com.spreadsheet.services.DataServices;
import com.spreadsheet.services.SpreadSheetServices;

public class DataTest {
	
	public static void main(String[] args) {
		DataServices dataServices = new DataServices();
		SpreadSheetServices spreadsheetServices = new SpreadSheetServices();
		
		
		
		Data data = new Data();
		data.setCol("A");
		data.setRow(2);
		data.setValue("Ngoc Le");
		
		// we use spreadsheet have id = 1 because before we inserted 1 row to SpreadSheet table.
		SpreadSheet ss  = spreadsheetServices.findSpreadSheetById(1);
		
		
		data.setSpreadsheetData(ss);
		
		
		dataServices.saveData(data);
		
	}


}
