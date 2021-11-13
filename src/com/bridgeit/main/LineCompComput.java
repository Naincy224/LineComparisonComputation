package com.bridgeit.main;

public class LineCompComput {

	public void printWelcomeMessage() {

		System.out.println("Welcome to Line Comparison Computation Program");

	}
	//Adding method to make line
	public double makeLine(Point point1, Point point2) {

		double length1 = Math.sqrt((point2.getX() - point1.getX()) ^ 2 + (point2.getY() - point1.getY()) ^ 2);

		return length1;

	}
    //Adding method to compare two lines
	public void compareLine (double length1, double length2) {
        
		
		if (length1==length2) {
		System.out.println("The lines are equal");
		}
		else if (length1<=length2){
		System.out.println("The first line is less than second line");
		}
		else {
			System.out.println("The first line is greater than second line");
		}
		
		
			
	}
	
	
}
