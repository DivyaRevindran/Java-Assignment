package Polymorphism;
//question 1

import java.util.Scanner;

public class ShapeMain {

	public static void calculateArea(Shape s) {
		s.area();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle:");
		Rectangle rect = new Rectangle(scan.nextInt(), scan.nextInt());
		System.out.println("Enter the dimensions of Square:");
		Square sqr = new Square(scan.nextInt());
		calculateArea(rect);
		calculateArea(sqr);

	}

}
