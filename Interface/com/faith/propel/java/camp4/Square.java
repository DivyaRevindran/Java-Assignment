package com.faith.propel.java.camp4;
//question 1
public class Square implements Shape{

	private int side;
	
	
	public Square(int side) {
		super();
		this.side = side;
	}


	@Override
	public void area() {
		System.out.println("Area of square is "+(side*side));
		
	}

}
