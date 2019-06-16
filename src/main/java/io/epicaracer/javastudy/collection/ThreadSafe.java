package io.epicaracer.javastudy.collection;

public class ThreadSafe {
	/*
	 *
	 * 동기화된 컬렉션
	 * ArrayList, HashSet, HashMap을 synchronized List로 변경하는 방법
	 * 
	 * List<T> list = Collections.synchronizedList(new ArrayList<T>());
	 * 
	 * Set<E> set = Collections.synchronizedSet(new HashSet<E>());
	 * 
	 * Map<K,V> map = Collections.synchronizedMap(new HashMap<K,V>());
	 */
	
	/*
	 * 병렬 처리를 위한 컬렉션
	 * 동기화된 컬렉션은 멀티 스레드 환경에서 하나의 스레드가 요소를 안전하게 처리하도록 도와주지만
	 * 전체 요소를 빠르게 처리하지는 못한다.
	 * 하나의 스레트가 요소를 초리할 때 전체 잠금이 발생하여 다른 스레드는 대기 상태가 된다.
	 * 그렇기 때문에 멀티 스레드가 병렬적으로 컬렉션의 요소들을 처리할 수 없다.
	 * 
	 * Map<K,V> ma = new ConcurrentHashMap<K,V>();
	 * 
	 * Queue<E> queue = new ConcurrentLinkedQueue<E>();
	 * 
	 */
}
