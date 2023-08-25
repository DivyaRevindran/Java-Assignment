package VariablesAndDatatypes;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int quotient = n1/n2;
		int reminder = n1%n2;
		System.out.println("quotient:"+quotient);
		System.out.println("reminder:"+reminder);

	}

}
