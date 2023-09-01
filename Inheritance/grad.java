package Inheritance;
//question 4
public class grad extends Student{
	

	public grad(String name, int id, double grade, int age, String address) {
		super(name, id, grade, age, address);
		
	}

	boolean isPassed()
	{
		if(grade>80.0)
		{
			return true;
		}
		else
			return false;
	}

}
