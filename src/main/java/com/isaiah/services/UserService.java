package com.isaiah.services;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.isaiah.objects.User;
import com.isaiah.objects.hibernate.HibernateClient;

public class UserService {

	private static HibernateClient HC;
	
	public static void createUser(User user) {
		Session session = HC.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			
			session.save(user);
			transaction.commit();
			
		} catch(Exception e) {
			
			rollbackTransactionIfNotNull(transaction);
			e.printStackTrace();
			
		} finally {
			session.close();
		}
		
		
		System.out.println(user.toString() + " added to database via UserService");
	}
	
	
	public static User readUserById(int userID) {
		User user = null;
		Session session = HC.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			user = session.get(User.class, userID);
			
			
		} catch(Exception e) {
			
			rollbackTransactionIfNotNull(transaction);
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		System.out.println("Successfully read and retrieved User ID: " + user.getUserID() + " from DB via Hibernate");
		
		return user;
	}
	
	public static User readUserByObj(User user){
		return readUserById(user.getUserID());
		
	}
	
	public static void updateUsernameById(int userID, String updateUsername) {
		Session session = HC.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			User user = session.get(User.class, userID);
			user.setUsername(updateUsername);
			session.update(user);
			transaction.commit();
			
			
		} catch(Exception e) {
			
			rollbackTransactionIfNotNull(transaction);
			e.printStackTrace();
			
		} finally {
			session.close();
		}
		
	}
	
	public static void updatePasswordById(int userID, String updatePassword) {
		Session session = HC.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			User user = session.get(User.class, userID);
			user.setPassword(updatePassword);
			session.update(user);
			transaction.commit();
			
		} catch(Exception e) {
			rollbackTransactionIfNotNull(transaction);
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}
	
	
	public static void updateEmailById(int userID, String updateEmail) {
		Session session = HC.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			User user = session.get(User.class, userID);
			user.setEmail(updateEmail);
			session.update(user);
			transaction.commit();
			
		} catch(Exception e) {
			rollbackTransactionIfNotNull(transaction);
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	
	public static void deleteUserById(int userID) {
		Session session = HC.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			User user = session.get(User.class, userID);
			session.delete(user);
			transaction.commit();
			
			
		} catch(Exception e) {
			rollbackTransactionIfNotNull(transaction);
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}
	
	public static void deleteUserByObj(User user) {
		deleteUserById(user.getUserID());
	}
	
	
	
	/*
	 * Utility Method
	 */
	private static void rollbackTransactionIfNotNull(Transaction t) {
		if(t != null) {
			t.rollback();
		}
	}
	
}
