package Inheritance;
//question 4
public class undergrad extends Student{
	

	public undergrad(String name, int id, double grade, int age, String address) {
		super(name, id, grade, age, address);
		
	}

	boolean isPassed()
	{
		if(grade>70.0)
		{
			return true;
		}
		else
			return false;
	}

}
