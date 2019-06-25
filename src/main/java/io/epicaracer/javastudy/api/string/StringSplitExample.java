package io.epicaracer.javastudy.api.string;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-"); //정규식( & or , or -) 가 구분자인 경우 split
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
