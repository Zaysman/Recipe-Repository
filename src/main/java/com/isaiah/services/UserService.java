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
		
	}
	
	
	public static User readUser(int userID) {
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
		
		
		return user;
	}
	
	public static void updateUsernameByID(int userID, String updateUsername) {
		Session session = HC.getSessionFactory().getCurrentSession();
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
	
	public static void updatePasswordByID(int userID, String updatePassword) {
		Session session = HC.getSessionFactory().getCurrentSession();
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
	
	
	public static void updateEmailByID(int userID, String updateEmail) {
		Session session = HC.getSessionFactory().getCurrentSession();
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
	
	
	public void deleteStudentByID(int userID) {
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
	
	
	
	/*
	 * Utility Method
	 */
	public static void rollbackTransactionIfNotNull(Transaction t) {
		if(t != null) {
			t.rollback();
		}
	}
	
}
