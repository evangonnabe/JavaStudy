package io.epicaracer.javastudy.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		/* 
		 * 내림차순 정렬자를 이용해서 TreeSet에 Fruit를 저장.
		 * 정렬자를 주지 않고 저장하면 ClassCastExeption 예외 발생
		 * 정렬자를 TreeSet의 생성자에 주면 예외가 발생하지 않고 자동적으로 내림차순 정렬
		 */
		
		/*
	TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
	
	treeSet.add(new Fruit("포도",3000));
	treeSet.add(new Fruit("수박",10000));
	treeSet.add(new Fruit("딸기",6000));
		 */
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator()); //내림차순 정렬자 제공
		
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",10000));
		treeSet.add(new Fruit("딸기",6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
