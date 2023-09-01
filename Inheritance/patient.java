package Inheritance;
//Question3
import java.time.Year;
import java.util.Date;

public class patient extends Person{

	private int patientNo;
	private String hospital;
	private int yearOfJoining;
	private String address;
	private double medicalFees;
	public patient(String name, String phNo, int patientNo, String hospital, int yearOfJoining, String address) {
		super(name, phNo);
		this.patientNo = patientNo;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "patient [patientNo=" + patientNo + ", hospital=" + hospital + ", yearOfJoining=" + yearOfJoining
				+ ", address=" + address + ", medicalFees=" + medicalFees + "]";
	}
	public double calculateMedicalFees(Money obj)
	{
		double amount = obj.paymentPerYear();
		int year=Year.now().getValue();
		int noOfYears = year-yearOfJoining;
		medicalFees = noOfYears * amount;
		return medicalFees;
	}

}
