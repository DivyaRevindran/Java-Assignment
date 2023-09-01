package Inheritance;
//Question1
public class Car extends Vehicle{

	
	public void BrandName()
	{
		System.out.println("Introducing Nissan Magnite");
	}
	public void color()
	{
		System.out.println("Color of the car is red");
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.BrandName();
		c1.color();

	}

}
