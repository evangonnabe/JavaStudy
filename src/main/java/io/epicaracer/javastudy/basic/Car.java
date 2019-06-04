package io.epicaracer.javastudy.basic;


public class Car {
	private int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
				
			}else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
}
