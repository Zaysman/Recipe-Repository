package com.isaiah.objects;

public class Step {
	
	private int stepID, stepNum, recipeID;
	private String stepDesc, stepNote;
	
	public Step() {
		this(-1, -1, -1, "", "");
	}
	
	public Step(int stepID, int stepNum, int recipeID, String stepDesc, String stepNote) {
		super();
		this.stepID = stepID;
		this.stepNum = stepNum;
		this.recipeID = recipeID;
		this.stepDesc = stepDesc;
		this.stepNote = stepNote;
	}

	public int getStepID() {
		return stepID;
	}

	public void setStepID(int stepID) {
		this.stepID = stepID;
	}

	public int getStepNum() {
		return stepNum;
	}

	public void setStepNum(int stepNum) {
		this.stepNum = stepNum;
	}

	public int getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(int recipeID) {
		this.recipeID = recipeID;
	}

	public String getStepDesc() {
		return stepDesc;
	}

	public void setStepDesc(String stepDesc) {
		this.stepDesc = stepDesc;
	}

	public String getStepNote() {
		return stepNote;
	}

	public void setStepNote(String stepNote) {
		this.stepNote = stepNote;
	}

	@Override
	public String toString() {
		return "Step [stepID=" + stepID + ", stepNum=" + stepNum + ", recipeID=" + recipeID + ", stepDesc=" + stepDesc
				+ ", stepNote=" + stepNote + "]";
	}
	
	

}
