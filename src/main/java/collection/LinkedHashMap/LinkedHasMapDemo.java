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
	}
	

}
