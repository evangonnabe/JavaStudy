package io.epicaracer.javastudy.lambda;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//lambda expression
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				//바깥 객체의 참조를 얻기 위해 this를 사용
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField : " + innerField);
				//람다식 내부에서 this는 Inner객체를 참조
				System.out.println("innerField : " + this.innerField + "\n");
			};
			
			fi.method();
			
		}
	}
}
