package Abstraction;

public class Main {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.saySomething();
		c1.cry();
		c1.fly();
		c1.setColor("White");
		c1.setNoOfLegs(4);
		c1.walk(c1.getNoOfLegs());
		Dog d1 = new Dog();
		d1.saySomething();
		d1.cry();
		d1.fly();
		d1.setColor("Black and White");
		d1.setNoOfLegs(4);
		d1.walk(d1.getNoOfLegs());
		Goat g1 = new Goat();
		g1.cry();
		g1.fly();
		g1.setColor("White");
		g1.setNoOfLegs(4);
		g1.walk(g1.getNoOfLegs());
		Crow c = new Crow();
		c.cry();
		c.fly();
		c.setColor("Black");
		c.setNoOfLegs(2);
		c.walk(c.getNoOfLegs());
		Chicken c2 = new Chicken();
		c2.cry();
		c2.fly();
		c2.setColor("Brown");
		c2.setNoOfLegs(2);
		c2.walk(c2.getNoOfLegs());
		MyAnimals a = new MyAnimals();
		a.setBodyTemp(28);
		System.out.println("Body temperature is "+a.getBodyTemperature());
		

	}

}
