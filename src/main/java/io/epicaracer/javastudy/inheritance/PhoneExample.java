package io.epicaracer.javastudy.inheritance;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();  // 추상클래스는 인스턴스화 할수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
