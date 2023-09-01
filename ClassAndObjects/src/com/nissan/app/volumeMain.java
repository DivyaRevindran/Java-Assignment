package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.box;

public class volumeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		box obj1 = new box();
		box obj2 = new box();
		
		System.out.println("Enter the width:");
		obj1.setWidth(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter the depth:");
		obj1.setDepth(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter the height:");
		obj1.setHeight(Double.parseDouble(scan.nextLine()));
		System.out.println("Volume is "+obj1.volume());
		
		System.out.println("Enter the width:");
		obj2.setWidth(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter the depth:");
		obj2.setDepth(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter the height:");
		obj2.setHeight(Double.parseDouble(scan.nextLine()));
		System.out.println("Volume is "+obj2.volume());
	}

}
