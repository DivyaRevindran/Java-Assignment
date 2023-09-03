package com.faith.propel.java.camp4;
//question 1
import java.util.Scanner;

public class Main {

	public static void calculateArea(Shape s)
	{
		s.area();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle:");
		Rectangle rect[]= new Rectangle[5];
		Square sqr[]= new Square[5];
		char ch='n';
		int i=0,j=0;
		do {
		System.out.println("Enter the dimensions of rectangle:");
		rect[i++]= new Rectangle(scan.nextInt(),scan.nextInt());
		if(i==5)
		{
			break;
		}
		System.out.println("Do you want to continue?(Y/N)");
		ch = scan.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		do {
			System.out.println("Enter the dimensions of Square:");
			sqr[j++]= new Square(scan.nextInt());
			if(j==5)
			{
				break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			ch = scan.next().charAt(0);
			}while(ch=='y' || ch=='Y');
		for(Rectangle r:rect)
		{
			try {
			calculateArea(r);
			}
			catch(NullPointerException e)
			{
				
			}
		}
		for(Square sq:sqr)
		{
			try {
			calculateArea(sq);
			}
			catch(NullPointerException e)
			{
				
			}
		}
	}

}
