package io.epicaracer.javastudy.basic;

public class CarExample {
	public static void main(String[] args) {
		//
		Car myCar = new Car();
		
		myCar.setGas(7);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}
		
	}
	
}
