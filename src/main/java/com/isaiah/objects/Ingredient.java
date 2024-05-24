package com.isaiah.objects;

public class Ingredient {
	
	private String name, unit;
	private int quantity, recipeID;
	
	public Ingredient() {
		this("default ingredient name", "miligram", 0, -1);
	}
	
	public Ingredient(String name, String unit, int quantity, int recipeID) {
		super();
		this.name = name;
		this.unit = unit;
		this.quantity = quantity;
		this.recipeID = recipeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(int recipeID) {
		this.recipeID = recipeID;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", unit=" + unit + ", quantity=" + quantity + ", recipeID=" + recipeID
				+ "]";
	}
	
	
	
	

}
