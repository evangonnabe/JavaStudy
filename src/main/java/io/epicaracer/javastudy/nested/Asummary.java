package io.epicaracer.javastudy.nested;

//��ø Ŭ������ ����ϸ� �� Ŭ������ ������� ���� ���� ���٤��� �� �ִٴ� ����
//�ܺο��� ���ʿ��� ���� Ŭ������ �������ν� �ڵ��� ���⼺�� ���� �� ����
//
//1. �ν��Ͻ� ��� Ŭ����(instatnce member) : A��ü�� �����ؾ߸� ��밡���� B ��øŬ����
//2. ���� ��� Ŭ���� : A Ŭ������ �ٷ� ������ �� �ִ� ��øŬ����
//3. ����Ŭ���� : method()�� ������ ���� ����� �� �ִ� ��ø Ŭ����

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
