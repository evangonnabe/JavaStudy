package io.epicaracer.javastudy.stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",92),
				new Student("신용권",95),
				new Student("감자바",88));
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum(); //sum() 이용
		
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a, b) -> a+b) //reduce(BinaryOperator<Integer> ac) 이용
				.get();
		
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a+b); //값이 없을 경우 default값은 0
		
		System.out.println("sum1:" + sum1);
		System.out.println("sum2:" + sum2);
		System.out.println("sum3:" + sum3);
	}
}
