package Abstraction;

public class Chicken extends Animals{

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cry() {
		System.out.println("Chicken cry ko ko ko");
		
	}

	@Override
	public void fly() {
		System.out.println("chicken can fly short distance");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Chicken walking with "+noOfLegs +" legs");
	}
}
