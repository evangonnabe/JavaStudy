package io.epicaracer.javastudy.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		
		/*
		 * natural order
		 * sorted()
		 * sorted( (a,b) -> a.compareTo(b) );
		 * sorted( Comparator.naturalOrder() );
		 * 
		 * reverse order
		 * sorted( (a,b) -> b.compareTo(a) );
		 * sorted( Comparator.reverseOrder() );
		 * 
		 * 객체 요소가 Comparable을 구현하지 않았다면 Comparator를 매개값으로 갖는 sorted() 메소드를 사용
		 * Compatator는 함수적 인터페이스므로 람다식으로 매개값 작성 가능
		 * sorted( (a,b) -> {...})
		 * 중괄호 안에는 a와 b를 비교해서 a가 작으면 음수, 같으면 0, a가 크면 양수를 리턴하는 코드를 작성.
		 * 
		 */
		
		//숫자 요소의 경우
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream
		.sorted()
		.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		//객체 요소의 경우
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 30),	
			new Student("신용권", 10),	
			new Student("유미선", 20));
		
		studentList.stream()
		.sorted()
		.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		studentList.stream()
		.sorted(Comparator.reverseOrder()) //student class의 comparator 구현체 사용
		.forEach(s -> System.out.print(s.getScore() + ","));
		
	}
}
