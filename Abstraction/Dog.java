package Abstraction;

public class Dog extends Animals{

	@Override
	public void saySomething() {
		System.out.println("Dogs Say Bow Wow");
		
	}

	@Override
	public void cry() {
		System.out.println("Dogs cry bow bow");
		
	}

	@Override
	public void fly() {
		System.out.println("Dogs can't fly");
		
	}
	@Override
	public void walk(int noOfLegs) {
		System.out.println("Dog walking with "+noOfLegs +" legs");
	}
}
