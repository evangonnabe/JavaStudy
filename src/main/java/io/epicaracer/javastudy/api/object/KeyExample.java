package io.epicaracer.javastudy.api.object;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// key객체를 식별키로 사용하여 String 값을 저장하는 HashMap객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}
}
