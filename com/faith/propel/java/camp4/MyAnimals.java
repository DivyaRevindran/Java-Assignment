package com.faith.propel.java.camp4;
//question 3

public class MyAnimals extends Animals implements Imammals {

	private String BodyTemp;

	public String getBodyTemp() {
		return BodyTemp;
	}

	public void setBodyTemp(String bodyTemp) {
		BodyTemp = bodyTemp;
	}

	@Override
	public int GetBodyTemp(String temp) {
		
		return Integer.parseInt(temp);
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub

	}

}
