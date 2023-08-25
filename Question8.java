package VariablesAndDatatypes;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt();
		System.out.println("Before swapping n1:"+n1+" n2:"+n2);
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping n1:"+n1+" n2:"+n2);
	}

}
