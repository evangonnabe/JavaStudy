package io.epicaracer.javastudy.lambda;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method Call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("method Call2"); };
		fi.method();
		
		fi= () -> System.out.println("method Call3");
		fi.method();
	}
}
