package io.epicaracer.javastudy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/* 예외 발생 (리스트에 데이터가 없음)
		 * NoSuchElementException
		 * 
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
		*/		
		
		/*
		 * Optional methods
		 * 
		 * boolean isPresent() : 값이 저장되어 있는지 여부
		 * 
		 * T orElse(T) : 값이 저장되지 않은경우 디폴트 값 지정
		 * double orElse(double), int orElse(int), long orElse(long)
		 *
		 * void ifPresent(Consumer) : 값이 저장되어 있을 경우 Consumer에서 처리
		 * void ifPresent(DoubleConsumer), void ifPresent(intConsumer), void ifPresent(longConsumer)
		 */
		
		
		//방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) { //optional 객체가 값이 저장되었는지 확인
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}
		
		//방법2
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);  //평균값을 구할 수 없는 경우 default 값을 정해둠
		System.out.println("방법2_평균: " + avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a)); //평균값이 있을 경우에만 값을 이용하는 람다식
	}
}
