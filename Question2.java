package ControlStructures;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String pinNo = "NULL";
		System.out.println("Enter the pin : ");
		pinNo = scan.nextLine();

		if (checkPin(pinNo))
			System.out.println("You Entered the correct PIN Number!!");
		else
			System.out.println("PIN Number is incorrect!!");

	}

	public static boolean checkPin(String pin) {
		String actualPin = "8642";
		return pin.equals(actualPin);
	}

}
