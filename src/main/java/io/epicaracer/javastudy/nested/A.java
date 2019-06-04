package io.epicaracer.javastudy.nested;

public class A {
	A(){
		System.out.println("A按眉啊 积己凳");
	}
	
	//instance member class
	class B {
		B(){
			System.out.println("B按眉啊 积己凳");
		}
		int field1;
		//static int field2;
		void method1() {
			
		}
//		static void method2() {
//			
//		}
	}
	
	// static member class
	static class C{
		C(){
			System.out.println("C按眉啊 积己凳.");
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	// local member class
	
	void method() {
		class D {
			D(){
				System.out.println("D按眉啊 积己凳.");
			}
			int field1;
//			static int field2;
			void method1() {
				
			}
//			static void method2() {
//				
//			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
}
