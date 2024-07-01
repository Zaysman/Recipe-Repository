package com.isaiah.testClasses;

import com.isaiah.objects.Ingredient;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.IngredientService;

public class TestIngredientService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test create Service
		Ingredient testIngredient = new Ingredient();
		
		//IngredientService.createIngredient(testIngredient); //works
		
		//Test Read Service
		Ingredient readIngredient = IngredientService.readIngredientByEntryID(1);
		
		System.out.println("readIngredient:\n" 
		+ readIngredient + "\n"); //works
		
		//test Update Service
		testIngredient.setEntryID(1);
		testIngredient.setName("test Ingredient");
		testIngredient.setQuantity(1);
		testIngredient.setUnit("kilograms");
		
		IngredientService.updateIngredientByEntryID(testIngredient.getEntryID(), testIngredient);
		
		readIngredient = IngredientService.readIngredientByEntryID(1);
		System.out.println("readIngredient:\n" 
				+ readIngredient + "\n"); //works
		
		
		//test Delete Service
		//IngredientService.deleteIngredientByEntryID(1); //works
		
		
		
		
		
		


	}
	
	

}
