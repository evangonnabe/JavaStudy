package io.epicaracer.javastudy.interfaces;

public class ImpleExample {
	public static void main(String[] args) {
		ImplemantationC imple = new ImplemantationC();
		
		InterfaceA ia = imple;
		ia.methodA();
		System.out.println("-----------");

		InterfaceB ib = imple;
		ib.methodB();
		System.out.println("-----------");
		
		InterfaceC ic = imple;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
