package com.spreadsheet.services;

import com.spreadsheet.dao.DataDao;
import com.spreadsheet.model.Data;

public class DataServices {

	private DataDao dataDao = new DataDao();

	public boolean saveData(Data dt) {
		return dataDao.save(dt);
	}

}
