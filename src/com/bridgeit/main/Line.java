package com.bridgeit.main;

public class Line {

	private Point point1;
	private Point point2;
	private double lenght;
	

	public Line() {

	}

	public Line(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;

	}

	public void makeLine() {

		this.lenght = Math
				.sqrt((this.point2.getX() - this.point1.getX()) ^ 2 + (this.point2.getY() - this.point1.getY()) ^ 2);

	}

	public double getLenght() {
		return this.lenght;
	}

	// Adding method to compare two lines
	public static void compareLine(Line line1, Line line2) {

		if (line1.getLenght() == line2.getLenght()) {
			System.out.println("The lines are equal");
		} else if (line1.getLenght() < line2.getLenght()) {
			System.out.println("The first line is less than second line");
		} else {
			System.out.println("The first line is greater than second line");
		}

	}
}
