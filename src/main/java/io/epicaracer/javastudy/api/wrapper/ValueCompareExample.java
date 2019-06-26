package io.epicaracer.javastudy.api.wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		//byte, short, int type의 경우 값의 범위는 -128~127
		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과 : " + (obj1 == obj2));
		System.out.println("언박싱 후 ==결과 : " + (obj1.intValue() ==obj2.intValue()));
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println();

		System.out.println("[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3 == obj4));
		System.out.println("언박싱 후 ==결과 : " + (obj3.intValue() ==obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
	
	}
}
