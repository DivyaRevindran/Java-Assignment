package ControlStructures;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice,unit;
		char ch;
		do {
		System.out.println("Choose the type of customer : ");
		System.out.println("1-Domestic");
		System.out.println("2-Industrial");
		System.out.print("Choose an option : ");
		choice=scan.nextInt();
		System.out.print("Enter the reading : ");
		unit=scan.nextInt();
		if(choice==1)
			domesticBill(unit);
		else if(choice==2)
			industrial(unit);
		else
			System.out.println("Invalid option chosen!!");
		System.out.println("Do you want to continue ?(y/n)");
			ch = scan.next().charAt(0);
		}while(ch=='y');
		
	}

	private static void industrial(int unit) {
		float bill;
		bill=unit*10;
		System.out.println("The total bill amount is "+bill);
	}

	private static void domesticBill(int unit) {
		float bill;
		if (unit>=0 && unit<=100)
			bill=unit*1;
		else if (unit>=100 && unit<=200)
			bill=(float) (unit*1.5);
		else if (unit>=200 && unit<=500)
			bill=unit*2;
		else
			bill=unit*5;
			System.out.println("The total bill amount is "+bill);
	}

}
