package io.epicaracer.javastudy.stream;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2==0); //모두 참을 만족할 경우 true
		System.out.println("모두 2의 배수인가? " + result);

		result = Arrays.stream(intArr)
				.anyMatch(a -> a%2==0); //어느 하나라도
		System.out.println("하나라도 3의 배수가 있는가? " + result);

		result = Arrays.stream(intArr)
				.noneMatch(a -> a%2==0); //모두 불만족
		System.out.println("3의 배수가 없는가? " + result);
	
	
	}
}
