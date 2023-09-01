package Inheritance;

public class patientTester {

	public static void main(String[] args) {
		patient obj = new patient("Maya","9585895455",101,"Gov hospital",2022,"Kollam");
		Money obj1 = new Money();
		double medicalFees=obj.calculateMedicalFees(obj1);
		System.out.println("Medical fees is "+medicalFees);

	}

}
