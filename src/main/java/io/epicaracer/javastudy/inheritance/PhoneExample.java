package io.epicaracer.javastudy.inheritance;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();  // �߻�Ŭ������ �ν��Ͻ�ȭ �Ҽ� ����
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
