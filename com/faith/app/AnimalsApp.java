package com.faith.app;
//question 3

import com.faith.propel.java.camp4.Cat;
import com.faith.propel.java.camp4.Dog;
import com.faith.propel.java.camp4.MyAnimals;



public class AnimalsApp {

	public static void main(String args[])
	{
		MyAnimals m = new MyAnimals();
		m.setBodyTemp("25");
		System.out.println("Body temperature is "+m.getBodyTemp());
		System.out.println("getBodyTemperature method in Imammals returns "+m.GetBodyTemp(m.getBodyTemp()));
		Cat c1 = new Cat();
		c1.saySomething();
		Dog d1 = new Dog();
		d1.saySomething();
	}
}
