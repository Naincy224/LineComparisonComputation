package com.bridgeit.main;

public class LineCompComput {
	
	public void printWelcomeMessage() {

		System.out.println("Welcome to Line Comparison Computation Program");

	}
	
	public double makeLine(Point point1, Point point2) {
		
		double length= Math.sqrt( (point2.getX() - point1.getX()) ^ 2 + (point2.getY()- point1.getY()) ^ 2);
		
		return length;
		
	}
		
}

	
	
	

