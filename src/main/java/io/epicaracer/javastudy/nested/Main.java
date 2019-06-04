package io.epicaracer.javastudy.nested;

import io.epicaracer.javastudy.nested.A.C;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		// instance member class
		A.B  b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// static member class
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		C.field2 = 3;
		C.method2();
		
		// local method
		a.method();
		
	}
}
