package Abstraction;

public class Cat extends Animals{

	@Override
	public void saySomething() {
		System.out.println("Cats Say Meoow");
		
	}

	@Override
	public void cry() {
		System.out.println("Cats cry Meow");
		
	}

	@Override
	public void fly() {
		System.out.println("Cats can't fly");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Cat walking with "+noOfLegs +" legs");
	}

}
