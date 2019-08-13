package io.epicaracer.javastudy.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		/* 
		 * collect() - 필요한 요소만 컬렉션으로 담을 수 있고, 요소들을 그룹핑한 후 집계(reduction)한다.
		 * Stream의 collect(Colletor <T,A,R> collector) 
		 * T요소를 A누적기(accumlator)가 R(요소가 저장될 컬렉션)에 저장한다.
		 * 
		 */

		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10, Student.Sex.MALE),
				new Student("김수애",6, Student.Sex.FEMALE),
				new Student("신용권",10, Student.Sex.MALE),
				new Student("박수미",6, Student.Sex.FEMALE));
		
		//남학생들만 묶어 List생성
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 HashSet 생성
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}
	
	
}
