package com.isaiah.testClasses;

import com.isaiah.objects.Comment;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.CommentService;

public class TestCommentService {
	
	
	public static void main(String[] args) {
		
		//test create Service
		Comment testComment = new Comment();
		
		//CommentService.createComment(testComment); //Works
		
		//Test Read Service
		Comment readComment = CommentService.readCommentByID(1);
		
		System.out.println("readComment:\n" 
				+ readComment + "\n"); //works
		
		//test Update Service
		testComment.setCommentContent("I've added something to the contents");
		testComment.setCommentRating(4.0f);
		
		CommentService.updateCommentByID(1, testComment);
		
		readComment = CommentService.readCommentByID(1);
		
		System.out.println("readComment after update:\n" 
				+ readComment + "\n"); // works
		
		//test Delete Service
		//CommentService.deleteCommentByID(1);
		
		
		
	}

}
