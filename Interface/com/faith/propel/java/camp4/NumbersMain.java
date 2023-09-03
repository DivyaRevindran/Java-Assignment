package com.faith.propel.java.camp4;

//question 2
public class NumbersMain {

	public static void main(String[] args) {
		Ifirst obj = new Numbers();
		obj.display();
		System.out.println("Value is " + obj.getValue());
		Isecond obj2 = new Numbers();
		obj2.dsiplay();
		obj2.demo();

	}
//output
	/*I am display method in Ifirst Interface
	 *Value is 5
	 *I am display method in Isecond Interface
	 *Demo method in Isecond interface
	*/
}
