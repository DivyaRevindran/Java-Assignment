package VariablesAndDatatypes;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary of Raju:");
		float salary = sc.nextFloat();
		float dearness=(40*salary)/100;
		float houseRent=(20*salary)/100;
		float total_salary=salary+dearness+houseRent;
		System.out.println("Total salary is "+total_salary);

	}

}
