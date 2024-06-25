package com.isaiah.recipe_repository;

import com.isaiah.objects.*;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.UserService;

/**
 * Hello world!
 *
 */
public class App {
    
	static HibernateClient HC;
	public static void main(String[] args){
        
		User testUser = new User();
		testUser.setUsername("test2");
		testUser.setPassword("test2");
		testUser.setEmail("test2email@gmail.com");
		
		UserService.createUser(testUser);
		
    }
}
