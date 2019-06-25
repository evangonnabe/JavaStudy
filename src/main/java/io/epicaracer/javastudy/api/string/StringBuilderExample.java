package io.epicaracer.javastudy.api.string;

/*
 * String은 내부 문자열을 수정할수 없어 새로운 String 객체를 만든다.
 * 결합 똔ㄴ 수정 연산자를 많이 사용할수록 string객체가 늘어나므로
 * java.lang의 StringBuffer(thread safe), StringBuilder(Single Therad)
 * StringBuilder 객체가 생성되었다면 버퍼 내에서 문자 추가, 삽입, 삭제 등의 작업 가능
 */

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); //index 6으로부터 13전까지 교체
		System.out.println(sb.toString());
		
		sb.delete(4, 5); //index 4로부터 5전까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수 : " + length);
		
		String result = sb.toString();
		System.out.println(result);
		
	}
}
