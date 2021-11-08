package com.bridgeit.main;

public class Mainclass {
	
	
	public static void main(String[] args) {

		
		  LineCompComput lineObj = new LineCompComput();
		  
		  
		  
		  lineObj.printWelcomeMessage();
		  Point point1=new Point(2,3);
		  Point point2=new Point(5,7);
		  
		  
		  double length1=lineObj.makeLine(point1, point2);
		  System.out.println("The Line length is:"+length1);
		  


	}
}
