package VariablesAndDatatypes;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem=0;
		int sum=0;
		System.out.println("Enter the five digit number:");
		int n=sc.nextInt();
		while(n>0)    
		{    
		rem=n%10;    
		sum=sum+rem;    
		n=n/10;    
		}  
		System.out.println("Sum of digits is "+sum);

	}

}
