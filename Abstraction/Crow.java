package Abstraction;

public class Crow extends Animals {

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cry() {
		System.out.println("Crows cry cra cra");
		
	}

	@Override
	public void fly() {
		System.out.println("crow can fly 1000ft");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Crow walking with "+noOfLegs +" legs");
	}

}
