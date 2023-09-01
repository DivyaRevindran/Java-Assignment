package Inheritance;
//question 4
public abstract class Student {
	String name;
	int id;
	double grade;
	int age;
	String address;


	public Student(String name, int id, double grade, int age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.age = age;
		this.address = address;
	}


	abstract boolean isPassed();
	
}
