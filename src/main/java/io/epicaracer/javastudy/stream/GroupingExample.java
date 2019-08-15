package io.epicaracer.javastudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애",6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("신용권",10, Student.Sex.MALE, Student.City.Pusan),
				new Student("박수미",6, Student.Sex.FEMALE, Student.City.Seoul)	
				);
		
		//방법1. 기존 방법
		Stream<Student> totalStream = totalList.stream();
		
		Function<Student, Student.City> classifier = Student :: getCity;
		
		Function<Student, String> mapper = Student :: getName;
		Collector<String, ? , List<String>> collector1 = Collectors.toList();
		Collector<Student, ? , List<String>> collecotr2 = Collectors.mapping(mapper, collector1);
		
		Collector<Student, ? , Map<Student.City, List<String>>> collector3 = 
				Collectors.groupingBy(classifier, collecotr2);
		
		Map<Student.City, List<String>> mapByCity1 = totalStream.collect(collector3);
		
		System.out.println("\n[서울]");
		mapByCity1.get(Student.City.Seoul).stream()
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\n[부산]");
		mapByCity1.get(Student.City.Pusan).stream()
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\n--------------");
		
		//방법2. 람다식 활용(더 쉬움)
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex));

		System.out.println("[남학생]");
		mapBySex.get(Student.Sex.MALE).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println("\n[여학생]");
		mapBySex.get(Student.Sex.FEMALE).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
					Collectors.groupingBy(
							Student :: getCity,
							Collectors.mapping(Student::getName, Collectors.toList())
							)
				);
				
		System.out.println("\n[서울]");
		mapByCity.get(Student.City.Seoul).stream()
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\n[부산]");
		mapByCity.get(Student.City.Pusan).stream()
		.forEach(s -> System.out.print(s + " "));
							
				
	}
}
