package com.spreadsheet.services;

import com.spreadsheet.dao.SpreadSheetDao;
import com.spreadsheet.model.SpreadSheet;

public class SpreadSheetServices {	
	private SpreadSheetDao ssDao = new SpreadSheetDao();
	
	public boolean saveSpreadSheet(SpreadSheet ss) {
		return ssDao.save(ss);
	}
	
	

}
