package com.bridgeit.main;

public class Mainclass {
	
	
	public static void main(String[] args) {
		  LineCompComput lineObj = new LineCompComput();
		  lineObj.printWelcomeMessage();
		  
		  Point point1=new Point(2,3);
		  Point point2=new Point(5,7);
		  Point point3=new Point(1,4);
		  Point point4=new Point(6,8);
		  
		  Line line1 = new Line(point1, point2);
		  Line line2 = new Line(point3, point4);
		  line1.makeLine();
		  line2.makeLine();
		  
		  
		  System.out.println("The First Line length is:"+line1.getLenght());
		  System.out.println("The Second Line length is:"+line2.getLenght());
		  Line.compareLine(line1, line2);


	}


}
