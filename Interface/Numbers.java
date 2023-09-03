package com.faith.propel.java.camp4;

public class Numbers implements Ifirst, Isecond {

	@Override
	public void display() {
		System.out.println("I am display method in Ifirst Interface");

	}

	@Override
	public int getValue() {
		return 5;

	}

	@Override
	public void dsiplay() {
		System.out.println("I am display method in Isecond Interface");

	}

	@Override
	public void demo() {
		System.out.println("Demo method in Isecond interface");

	}

}
