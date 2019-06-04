package io.epicaracer.javastudy.inheritance;

public class Tire {
	protected int maxRotation;
	protected int accumulatedRotation;
	protected String location;

	public Tire(String location, int maxRotation) {

		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
			
	}

}
