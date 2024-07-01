package com.isaiah.testClasses;

import com.isaiah.objects.User;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.UserService;

public class TestUserService {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User testUser = new User();
		testUser.setUsername("test3");
		testUser.setPassword("test3");
		testUser.setEmail("testemail3@gmail.com");
		
		System.out.println("test3 before adding to DB:\n" + testUser);
		
		UserService.createUser(testUser); //Works
		
		System.out.println("test3 after adding to DB:\n" + testUser);
		
		//testUser = UserService.readUserById(3);
		//System.out.println("testUser:\n"+ testUser); //works
		
		
		String updateUsername = "update", updatePassword = "nottest3", updateEmail = "testemail03@gmail.com";
//		testUser.setUsername(updateUsername);
//		testUser.setPassword(updatePassword);
//		testUser.setEmail(updateEmail);
		
		//UserService.updateUsernameById(testUser.getUserID(), updateUsername); //works
		
		testUser = UserService.readUserByID(testUser.getUserID());
		System.out.println("testUser after updating username:\n"+ testUser); 
		
		
		UserService.updatePasswordByID(testUser.getUserID(), updatePassword); //works
		
		testUser = UserService.readUserByID(testUser.getUserID());
		System.out.println("testUser after updating password:\n"+ testUser);
		
		
		UserService.updateEmailByID(testUser.getUserID(), updateEmail); //works
		
		testUser = UserService.readUserByID(testUser.getUserID());
		System.out.println("testUser after updating Email:\n"+ testUser);
		
		//UserService.deleteUserById(testUser.getUserID()); //works
		
		
	}

}
