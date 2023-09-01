package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.account;

public class accountMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		account ac = new account();
		char ch = 'n';
		System.out.println("Choose your option:");
		do {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance");
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the amount:");
				ac.deposit(Double.parseDouble(scan.nextLine()));
				break;
			case 2:
				System.out.println("Enter the amount:");
				ac.withdraw(Double.parseDouble(scan.nextLine()));
				break;
			case 3:
				System.out.println("Your Balance is " + ac.getBalance());
				break;

			default: {
				System.out.println("Enter a valid option!");
			}
			}
			System.out.println("Do you want to continue?(Y/N):");
			ch = scan.nextLine().charAt(0);
		} while (ch != ('Y') || ch != ('y'));

	}

}
