package io.epicaracer.javastudy.api.arrays;

public class Member implements Comparable<Member>{
	String name;
	Member(String name){
		this.name = name;
	}
	
	//name field값으로 정렬하기 위한 기능 정의
	@Override  
	public int compareTo(Member o) {
		/*
		 * 오름차순일때 자신이 매개값보다 낮을 경우 음수, 같은경우0, 높을 경우 양수
		 * 내림차순일때 자신이 매개값보다 낮을 경우 양수, 같은경우0, 높을 경우 음수
		 * 
		 */
		return name.compareTo(o.name);
	}
}
