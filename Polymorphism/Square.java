package Polymorphism;
//question 1

public class Square extends Shape {

	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of square is " + (side * side));

	}

}
