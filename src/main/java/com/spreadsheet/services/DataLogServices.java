package com.spreadsheet.services;

import com.spreadsheet.dao.DataLogDao;
import com.spreadsheet.model.DataLog;

public class DataLogServices {
	
	private DataLogDao dataLogDao = new DataLogDao();

	public DataLog saveData(DataLog dataLog) {
		return dataLogDao.save(dataLog);
	}

}
