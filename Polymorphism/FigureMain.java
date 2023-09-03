package Polymorphism;
//Question 2

import java.util.Scanner;

public class FigureMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RectangleQ2 rect = new RectangleQ2();
		System.out.println("Enter the length and breadth of rectangle:");
		rect.setDim1(scan.nextDouble());
		rect.setDim2(scan.nextDouble());
		System.out.println("Area of rectangle is "+rect.Area(rect.getDim1(), rect.getDim2()));
		Triangle tri = new Triangle();
		System.out.println("Enter the base and height of triangle:");
		tri.setDim1(scan.nextDouble());
		tri.setDim2(scan.nextDouble());
		System.out.println("Area of triangle is "+tri.Area(rect.getDim1(), rect.getDim2()));

	}

}
