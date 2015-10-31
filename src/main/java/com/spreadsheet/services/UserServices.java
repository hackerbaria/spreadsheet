package com.spreadsheet.services;

import com.spreadsheet.dao.UserDao;
import com.spreadsheet.model.SpreadSheet;
import com.spreadsheet.model.User;

public class UserServices {
	
	UserDao userDao = new UserDao();
	
	
	/*
	 *  this method will be used when user click login button.
	 */
	public User checkUser(User user) {
		return userDao.checkExistUser(user);
	}
	
	/**
	 * this method will be used when user click register button and the input information is valid.
	 * @param user
	 * @return
	 */
	public User saveUser(User user) {
		return userDao.save(user);
	}
	
	public User findUserSheetById(int id) {
		return userDao.findById(id);
	}

}
