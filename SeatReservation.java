package ControlStructures;

public class SeatReservation {

	String trainID;
	String trainName;
	String passengerName;

	SeatReservation(String trainID, String trainName, String passengerName) {
		this.trainID = trainID;
		this.trainName = trainName;
		this.passengerName = passengerName;
	}

	public String getReservation() {
		if (trainID.equals("45267"))
			return "Your Seat is Confirmed";
		return "Your Seat is Not COnfirmed!";

	}

}
