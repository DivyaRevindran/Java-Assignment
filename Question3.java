package ControlStructures;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for month : ");
		int month = scan.nextInt();
		String season="";
		if (month == 1 || month == 2 || month == 12)
			season = "Winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		if (month == 9 || month == 10 || month == 11)
			season = "Autumn";
		System.out.println("Season is " + season);
	}

}
