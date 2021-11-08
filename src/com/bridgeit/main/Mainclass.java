package com.bridgeit.main;

public class Mainclass {
	
	
	public static void main(String[] args) {

		
		  LineCompComput lineObj = new LineCompComput();
		  
		  
		  
		  lineObj.printWelcomeMessage();
		  Point point1=new Point(2,3);
		  Point point2=new Point(5,7);
		  Point point3=new Point(3,4);
		  Point point4=new Point(6,8);
		  
		  double length1=lineObj.makeLine(point1, point2);
		  System.out.println("The First Line length is:"+length1);
		  double length2=lineObj.makeLine(point3, point4);
		  System.out.println("The Second Line length is:"+length2);
		  lineObj.compareLine(length1, length2);

	}


}
