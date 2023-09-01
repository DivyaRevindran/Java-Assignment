package Inheritance;
//Question2

public class Box {

	public double width=0.0;
	public double depth=0.0;
	public double height=0.0;
	
	
	
	public Box(double width, double depth, double height) {
		super();
		this.width = width;
		this.depth = depth;
		this.height = height;
	}



	public double volume()
	{
		return width*depth*height;
	}
}
