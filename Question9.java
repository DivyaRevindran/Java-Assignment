package ControlStructures;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a real constant value to covert into Integer : ");
		double constant = scan.nextDouble();
		int integer = (int)constant;
		System.out.println("The integer value is "+integer);

	}

}
