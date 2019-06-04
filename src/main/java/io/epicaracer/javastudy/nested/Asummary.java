package io.epicaracer.javastudy.nested;

//중첩 클래스를 사용하면 두 클래서의 멤버들을 서로 쉽게 접근ㅎㄹ 수 있다는 장점
//외부에는 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있음
//
//1. 인스턴스 멤버 클래스(instatnce member) : A객체를 생성해야만 사용가능한 B 중첩클래스
//2. 정적 멤버 클래스 : A 클래스로 바로 접근할 수 있는 중첩클래스
//3. 로컬클래스 : method()가 실행할 때만 사용할 수 있는 중첩 클래스

public class Asummary {
	// instance member class
	class B {
		B() {

		}

		int field1;

//		static int field2; //static field (X)
		void method1() {

		}
//		static void  method2() { //static method (X)
//		}

	}
	
	// static member class
	static class C {
		C(){
			
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	//local calss (in method)
	void method() {
		class D{
			D(){
				
			}
			int field1;
			//static int field2; //static field (X)
			void method1() {
				
			}
//			static void method2() {  //static method (X)
//				
//			}
			
		}
		
		D d  = new D();
		d.field1 = 3;
		d.method1();
		
	}
	
	
	
}
