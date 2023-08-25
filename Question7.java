package ControlStructures;

public class Question7 {


	public static void main(String[] args) {
		
		Box b1 = new Box();
		float v1=b1.volume(10,8,6);
		Box b2 = new Box();
		float v2=b2.volume(25, 22, 20);
		
		System.out.println("Volume of box 1 = "+v1);
		System.out.println("Volume of box 2 = "+v2);
	}

}


