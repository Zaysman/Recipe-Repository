package com.isaiah.testClasses;

import com.isaiah.objects.NutritionInfo;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.NutritionInfoService;

public class TestNutritionInfoService {
	
	public static void main(String[] args) {
		
		//test create Service
		NutritionInfo test = new NutritionInfo();
		
		//NutritionInfoService.createNutritionInfo(test); works
		
		
		//test read Service
		NutritionInfo read = NutritionInfoService.readNutritionInfoByID(1);
		
		System.out.println("read:\n"
				+ read); //works
		
		//test update Service
		test.setCalories(100);
		test.setCarbs(25);
		test.setCholesterol(1500);
		test.setNutritionID(1);
		
		NutritionInfoService.updateNutritionInfoByID(1, test);
		
		read = NutritionInfoService.readNutritionInfoByID(1);
		System.out.println("read after update:\n"
				+ read); //works
		
		
		//test delete Service
		//NutritionInfoService.deleteNutritionInfoByID(1); //works
		
		
		
		
		
		
	}

}
