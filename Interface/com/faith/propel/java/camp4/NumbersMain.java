package com.faith.propel.java.camp4;

//question 2
public class NumbersMain {

	public static void main(String[] args) {
		Ifirst obj = new Numbers();
		obj.display();
		System.out.println("Value is " + obj.getValue());
		Isecond obj2 = new Numbers();
		obj2.demo();
		obj2.display();

	}
//output
	/*I am display method
	 *Value is 5
	 *Demo method in Isecond interface
	 *I am display method
*/
}
