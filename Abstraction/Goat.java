package Abstraction;

public class Goat extends Animals {

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cry() {
		System.out.println("Goats cry Meh Meh");
		
	}

	@Override
	public void fly() {
		System.out.println("Goats can't fly");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Goat walking with "+noOfLegs +" legs");
	}
}
