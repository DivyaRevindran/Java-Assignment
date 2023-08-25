package VariablesAndDatatypes;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in km:");
		float distance = sc.nextFloat();
		System.out.println("Distance in meters:" + distance * 1000 + " m");
		System.out.println("Distance in feet:" + distance * 3280.84 + " ft");
		System.out.println("Distance in inches:" + distance * 39370.14 + " in");
		System.out.println("Distance in centimeters:" + distance * 100000 + " cm");

	}

}
