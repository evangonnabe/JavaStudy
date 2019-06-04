package io.epicaracer.javastudy.interfaces;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2()");
	}
}
