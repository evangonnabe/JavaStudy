package io.epicaracer.javastudy.basic;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// service 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
//		Field[] getFields() : 필드 정보를 Field 배열로 리턴
//		Constructor[] getConstructors() : 생성자 정보를 contructor배열로 리턴
//		Method[] getDeclaredMethods() : 메소드 정보를 method배열로 리턴
		

		// 메소드 객체를 하나씩 처리
		for (Method method : declaredMethods) {
			// printAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotaion.class)) {
				// printAnnotation 객체 얻기
				PrintAnnotaion printAnnotation = method.getAnnotation(PrintAnnotaion.class);

				System.out.println("[" + method.getName() + "]");

				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					// 메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}

}
