package com.spreadsheet.test;

import com.spreadsheet.model.User;
import com.spreadsheet.services.UserServices;

public class UserTest {
	public static void main(String[] args) {
		
		UserServices services = new UserServices();
		
		User inputUser = new User();
		inputUser.setName("ngoc");
		inputUser.setPassword("ngoc@123");
		inputUser.setEmail("gaonline@gmail.com");
		/*inputUser.setName("thong");
		inputUser.setPassword("password@123");*/
		
		// check method : save a newuser into DB
		
		services.saveUser(inputUser);
		
		/*User result =services.checkUser(inputUser);
		System.out.println(result.getName());
		System.out.println(result.getPassword());*/
		
	}

}
