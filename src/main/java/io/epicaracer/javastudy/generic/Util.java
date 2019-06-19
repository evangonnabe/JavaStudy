package io.epicaracer.javastudy.generic;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	//제너릭 메서드, 매개 타입과 리턴타입으로 타입 파라미터를 갖는 메서드
	public static<K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	//제한된 type 파라미터. 상위type의 subclass만 가능(여기에서는 number의 하위클래스)
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
