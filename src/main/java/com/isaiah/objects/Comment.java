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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public int getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(int recipeID) {
		this.recipeID = recipeID;
	}

	public float getCommentRating() {
		return commentRating;
	}

	public void setCommentRating(float commentRating) {
		this.commentRating = commentRating;
	}

	@Override
	public String toString() {
		return "Comment [author=" + author + ", commentContent=" + commentContent + ", commentID=" + commentID
				+ ", recipeID=" + recipeID + ", commentRating=" + commentRating + "]";
	}
	
	
	
}
