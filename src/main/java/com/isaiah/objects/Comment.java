package com.isaiah.objects;

public class Comment {

	private User author;
	private String commentContent;
	private int commentID, recipeID;
	private float commentRating;
	
	public Comment() {
		this(new User(), "", -1, -1, 0.0f);
	}
	
	public Comment(User author, String commentContent, int commentID, int recipeID, float commentRating) {
		super();
		this.author = author;
		this.commentContent = commentContent;
		this.commentID = commentID;
		this.recipeID = recipeID;
		this.commentRating = commentRating;
	}
	
	
	
}
