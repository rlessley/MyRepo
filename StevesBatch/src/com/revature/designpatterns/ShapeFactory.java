package com.revature.designpatterns;

public class ShapeFactory {
	
	
	
	public static Shape retrieveShape(String input){
		if(input.toLowerCase().equals("circle")){
			return new Circle();
		}
		if(input.toLowerCase().equals("triangle")){
			return new Triangle();
		}
		return null;
	}
}
