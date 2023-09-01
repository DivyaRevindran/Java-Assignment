package Inheritance;

//Question2
public class BoxWeight extends Box {
	
	private double weight = 0.0;
	


	public BoxWeight(double width, double depth, double height, double weight) {
		super(width, depth, height);
		this.weight = weight;
	}



	public static void main(String[] args) {		
		BoxWeight b1 = new BoxWeight(12.0,15.0,20.0,250.0);
		BoxWeight b2 = new BoxWeight(15.0,18.0,25.0,350.0);
		double v1 = b1.volume();
		System.out.println("Volume of first object:"+v1);
		double v2 = b2.volume();
		System.out.println("Volume of second object:"+v2);
		System.out.println("Weight of first object:"+b1.weight);
		System.out.println("Weight of second object:"+b2.weight);
		
	}

}
