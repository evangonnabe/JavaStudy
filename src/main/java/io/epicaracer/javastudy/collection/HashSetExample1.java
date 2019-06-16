package io.epicaracer.javastudy.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Java는 중복이므로 한번만 저장됨
		set.add("myBatis");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("myBatis");
		
		System.out.println("총 객체 수: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		
	}
}
