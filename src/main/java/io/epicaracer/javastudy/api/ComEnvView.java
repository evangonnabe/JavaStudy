package io.epicaracer.javastudy.api;

//import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ComEnvView {
	public static void main(String[] args) {
		
		/*
		 * Map<String,String> envMap = new HashMap<String,String>();
		 * envMap.putAll(System.getenv());
		 */
		
		
		Map<String,String> envMap = System.getenv();
		
		Set<String> keySet = envMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = envMap.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		System.out.println(envMap.size());
		
	}
}
