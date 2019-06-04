package io.epicaracer.javastudy.inheritance;

public class HankookTire extends Tire {
	//
	public HankookTire(String location, int maxLotation) {
		super(location, maxLotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ¼ö¸í: " + (maxRotation-accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire ÆãÅ© ***");
			return false;
		}
			
	}
	
}
