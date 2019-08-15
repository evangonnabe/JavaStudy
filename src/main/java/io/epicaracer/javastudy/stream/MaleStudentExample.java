package io.epicaracer.javastudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동",10, Student.Sex.MALE),
			new Student("김수애",6, Student.Sex.FEMALE),
			new Student("신용권",10, Student.Sex.MALE),
			new Student("박수미",6, Student.Sex.FEMALE)
		);
		
		// 방법1 - 원론적인 방법 (MALE)
		Stream<Student> totalStream = totalList.stream();
		Stream<Student> maleStream = totalStream.filter(s -> s.getSex()== Student.Sex.MALE);
		
		Supplier<MaleStudent> supplier = () -> new MaleStudent();
		BiConsumer<MaleStudent, Student> accumulate = (ms, s) -> ms.accumulate(s);
		BiConsumer<MaleStudent, MaleStudent> combiner = (ms1, ms2) -> ms1.combine(ms2);
		
		MaleStudent maleStudent1 = maleStream.collect(supplier, accumulate, combiner);
		
		maleStudent1.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("----------------------");
		
		
		// 방법2 - 상기 코드에서 변수를 생략하는 방법 (FEMALE)
		MaleStudent maleStudent2 = totalList.stream()
				.filter(s -> s.getSex()== Student.Sex.FEMALE)
				.collect(
					() -> new MaleStudent(),
					(r, t) -> r.accumulate(t),
					(r1, r2) -> r1.combine(r2)
						);
		
		maleStudent2.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("----------------------");
		
		// 방법3 - 가장 좋은 방법 : 람다식을 메소드 참조로 변경하는 아래와 같이 더욱 간단히 작성 가능 (MALE)
//		MaleStudent maleStudent3 = totalList.stream() 순차처리
		MaleStudent maleStudent3 = totalList.parallelStream() //병렬처리(multi CPU 사용)
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent3.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
		
				
	}
}
