package io.epicaracer.javastudy.lambda;

/*
 * 람다식 기본 문법
 * 
 * (int a) -> { System.out.println(a); }
 * 매개변수 타입은 생략가능 (a) - { System.out.println(a); }
 * 하나의 매개변수만 있다면 a -> System.out.println(a)
 * 매개변수가 없다면 () -> {실행문; ... }
 * (x, y) -> { return x + y; };
 * 중괄호에 return만 있는 경우 return 문 없이  (x, y) -> x + y
 */ 


@FunctionalInterface
public interface MyFunctionalInterface {
	/*
	 * 하나의 추상 메서드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있음
	 * 두개 이상의 추상 메소드가 선언되지 않도록 컴파일러가 체크하는 기능 - @FunctionalInterface
	 */
	public void method();
//	public void otherMethod(); // 컴파일 오류
}

/* 이 인터페이스의 람다식
 * MyFunctionalInterface fi = () -> { ... }
 * 
 * 메서드의 호출은 fi.method()
 * 람다식의 중괄호 부분을 호출함.
 * 
 */
