package Inheritance;
//Question 4
public class StudentTester {

	public static void main(String[] args) {
		grad obj1 = new grad("Manu",101,75,21,"Kollam");
		boolean b1=obj1.isPassed();
		if(b1==true)
		{
			System.out.println(obj1.name+" passed");
		}
		else
		{
			System.out.println(obj1.name+" failed");
		}
		undergrad obj2 = new undergrad("Sanu",102,85,22,"Kottayam");
		boolean b2=obj2.isPassed();
		if(b2==true)
		{
			System.out.println(obj2.name+" passed");
		}
		else
		{
			System.out.println(obj2.name+" failed");
		}
	}

}
