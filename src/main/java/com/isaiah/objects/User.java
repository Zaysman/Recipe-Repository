package com.isaiah.objects;

public class User {
	
	private int userID;
	private String username, password, email;
	
	public User() {
		this(-1, "default username", "default password", "default@email.com");
	}
	
	public User(int userID, String username, String password, String email) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
	
}
