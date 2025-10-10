package collection.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class LinkedHasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(); // Contain Double linked List
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Abhishek",1);
		map.put("Udai",2);
		map.put("Sandesh",3);
		
		System.out.println(map);
		
		linkedHashMap.put("Abhishek",1);
		linkedHashMap.put("Udai",2);
		linkedHashMap.put("Sandesh",3);
		
		System.out.println(linkedHashMap);
		
		
		HashMap<String, Integer> Hashmap = new HashMap<>();
		LinkedHashMap<String ,Integer> linkedHash =  new LinkedHashMap<>(Hashmap);
		
		Hashmap.put("Abhishek",1);
		Hashmap.put("Udai",2);
		Hashmap.put("Sandesh",3);
		
		
		Hashmap.putIfAbsent("Archit",4);
		Hashmap.getOrDefault("Abhishek", 1);
		
		System.out.println(linkedHash);
		
	}
	

}
