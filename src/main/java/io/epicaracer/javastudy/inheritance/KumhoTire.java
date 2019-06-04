package io.epicaracer.javastudy.inheritance;

public class KumhoTire extends Tire {
	//
	public KumhoTire(String location, int maxLotation) {
		super(location, maxLotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " KumhoTire ��ũ ***");
			return false;
		}
			
	}
	
}
