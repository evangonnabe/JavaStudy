package io.epicaracer.javastudy.lambda;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;

//		arg = 31;  //arg는 final 특성을 가짐
//		localVar = 41; //LocalVar는 final특성을 가짐

		// lambda expression
		MyFunctionalInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		
		fi.method();
	}
}
