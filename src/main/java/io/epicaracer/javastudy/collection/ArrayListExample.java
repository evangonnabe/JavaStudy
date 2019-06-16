package io.epicaracer.javastudy.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		
		printList(list);
		
		list.add(2, "Database");
		list.add("myBatis");

		int size = list.size();
		
		String skill = list.get(2);
		System.out.println("총 객체 수 : " + size);
		System.out.println("2 : " + skill);
		System.out.println();
		
		printList(list);

		list.remove(2);
		list.remove(2);
		list.remove("myBatis");
		
		printList(list);
	}
	
	public static void printList(List<String> lists) {
		for(int i=0; i< lists.size(); i++) {
			String str = lists.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
}
