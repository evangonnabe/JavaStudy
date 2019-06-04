package io.epicaracer.javastudy.basic;

public class Service {
	@PrintAnnotaion
	public void method1() {
		System.out.println("실행내용1");
	}
	
	@PrintAnnotaion("*")
	public void method2() {
		System.out.println("실행내용2");
	}
	
	@PrintAnnotaion(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3");
	}
	
}
