package io.epicaracer.javastudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애",6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("신용권",10, Student.Sex.MALE, Student.City.Pusan),
				new Student("박수미",6, Student.Sex.FEMALE, Student.City.Seoul)	
				);
		
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(
					Collectors.groupingBy(
							Student::getSex, 
							Collectors.averagingDouble(Student::getScore)
							)
					);
		
		System.out.println("남학생 평균 점수 : " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균 점수 : " + mapBySex.get(Student.Sex.FEMALE));

		/* Collector<T,?,Double> averagingDouble(ToDoubleFunction<T> mapper) : 평균값을 산출 
		 * Collector<T,?,Long> counting() : T의 카운팅 수를 산출
		 * Collector<CharSequence,?,String> joining(CharSequence delimiter) : 구분자로 연결한 String을 산출
		 * Collector<T,?,Optional<T>> maxBy(Comparator<T> comparator) : 최대 T를 산출
		 * Collector<T,?,Optional<T>> minBy(Comparator<T> comparator) : 최소 T를 산출
		 * Collector<T,?,Integer> summingInt(ToIntFunction), summingLong(ToLongFunction), summingDouble(ToDoubleFunction) : 
		 * -> 타입의 합계 산출
		 * 
		 */
		
		
		//성별을 쉼표로 구분한 이름을 저장하는 Map얻기
		Map<Student.Sex, String>mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getSex,
								Collectors.mapping(Student::getName, Collectors.joining(",")
								)
						)
				);
		System.out.println("남학생 전체 이름 : " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 전체 이름 : " + mapByName.get(Student.Sex.FEMALE));
		
	}

}
