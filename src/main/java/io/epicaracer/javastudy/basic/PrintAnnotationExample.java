package io.epicaracer.javastudy.basic;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
//		Field[] getFields() : �ʵ� ������ Field �迭�� ����
//		Constructor[] getConstructors() : ������ ������ contructor�迭�� ����
//		Method[] getDeclaredMethods() : �޼ҵ� ������ method�迭�� ����
		

		// �޼ҵ� ��ü�� �ϳ��� ó��
		for (Method method : declaredMethods) {
			// printAnnotation�� ����Ǿ����� Ȯ��
			if (method.isAnnotationPresent(PrintAnnotaion.class)) {
				// printAnnotation ��ü ���
				PrintAnnotaion printAnnotation = method.getAnnotation(PrintAnnotaion.class);

				System.out.println("[" + method.getName() + "]");

				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					// �޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}

}
