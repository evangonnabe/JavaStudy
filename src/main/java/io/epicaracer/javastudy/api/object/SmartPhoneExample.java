package io.epicaracer.javastudy.api.object;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		/*
		 * System.out.println(객체)의 경우
		 * 객체에 정의된 .toString() 메서드를 호출하여 리턴값을 받아 출력.
		 */
		System.out.println(myPhone);
	}
}
