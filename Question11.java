package VariablesAndDatatypes;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem=0;
		int rev=0;
		System.out.println("Enter the five digit number:");
		int n=sc.nextInt();
		while(n>0)    
		{    
		rem=n%10;    
		rev=(rev*10)+rem;    
		n=n/10;    
		}  
		System.out.println("Reverse of number is "+rev);

	}

}
