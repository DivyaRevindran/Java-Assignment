package com.faith.propel.java.camp4;
//question 1
public class Rectangle implements Shape{

	private int length;
	private int breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void area() {
		System.out.println("Area of Rectangle is "+(length*breadth));
		
	}

}
