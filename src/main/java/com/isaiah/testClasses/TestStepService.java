package com.isaiah.testClasses;

import com.isaiah.objects.Step;
import com.isaiah.objects.hibernate.*;
import com.isaiah.services.StepService;
public class TestStepService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test create Service
		Step testStep = new Step();
		
		//StepService.createStep(testStep); //works
		
		//test read Service
		
		Step readStep = StepService.readStepByID(1);
		System.out.println("readStep:\n" 
				+ readStep ); //works
		
		//test update Service
		
		testStep.setStepID(1);
		testStep.setStepDesc("I've added something to the step description");
		testStep.setStepNum(1);
		
		StepService.updateStepByID(1, testStep);
		
		readStep = StepService.readStepByID(1);
		System.out.println("readStep after update:\n" 
				+ readStep ); // works
		
		//test delete Service
		//StepService.deleteStepByID(1); //works

	}

}
