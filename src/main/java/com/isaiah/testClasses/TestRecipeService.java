package com.isaiah.testClasses;

import java.time.Duration;

import org.hibernate.query.sqm.TemporalUnit;

import com.isaiah.objects.Recipe;
import com.isaiah.objects.User;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.RecipeService;
import com.isaiah.services.UserService;

public class TestRecipeService {
	
	public static void main(String[] args) {
		
		Recipe testRecipe = new Recipe();
		
		
		//Test Create Service
		User user = UserService.readUserByID(1);
		testRecipe.setAuthorId(user.getUserID());
		testRecipe.setComments(null);
		testRecipe.setCookTime(Duration.ofHours(1));
		testRecipe.setCuisineType("Italian");
		testRecipe.setDifflvl(3);
		testRecipe.setIngredients(null);
		testRecipe.setNutritionInfo(null);
		testRecipe.setPrepSteps(null);
		testRecipe.setPrepTime(Duration.ofHours(1));
		testRecipe.setRating(3.0f);
		testRecipe.setRecipeDesc("Test Desc");
		testRecipe.setRecipeTitle("Test Recipe");
		testRecipe.setServSize(2);
		testRecipe.setTotalTime(Duration.ofHours(3));
		testRecipe.setNutritionInfoId(1);
		
		//RecipeService.createRecipe(testRecipe); //Works
		
		
		//Test ReadService
		Recipe readRecipe = RecipeService.readRecipeByID(2);
		
		System.out.println("readRecipe:\n" 
				+ readRecipe+"\n");
		
		
		//Test UpdateService
		testRecipe.setRating(4.0f);
		RecipeService.updateRecipeById(2, testRecipe);
		
		readRecipe = RecipeService.readRecipeByID(readRecipe.getRecipeID());
		System.out.println("readRecipe after update:\n" 
				+ readRecipe); //works
		
		
		//test DeleteService
		RecipeService.deleteRecipeById(readRecipe.getRecipeID()); //works
		
		
		
		
		
	}

}
