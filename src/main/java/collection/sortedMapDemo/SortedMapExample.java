package collection.sortedMapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for ASEC order
		SortedMap<String, Integer> sortedMap = new TreeMap<>() ;
		
			sortedMap.put("Abhishek", 90);
			sortedMap.put("Aryan", 70);
			sortedMap.put("Vinay", 20);
			sortedMap.put("Mohit", 21);
			
			System.out.println(sortedMap);
			
			SortedMap<Integer, String> map = new TreeMap<>() ;
			map.put(87, "Eclipese");
			map.put(47, "MAC");
			map.put(97, "Keyboad");
			map.put(17, "Mouse");
			
			
			System.out.println(map);
			
			System.out.println(map.firstKey());
			System.out.println(map.lastKey());
			System.out.println(map.headMap(90));
			System.out.println(map.tailMap(90));
			System.out.println(map.subMap(70, 90));
			
			//DESC Order with Comparator
			SortedMap<Integer, String> map1 = new TreeMap<>((a,b) -> (b-a)) ;
			map1.put(87, "Eclipese");
			map1.put(47, "MAC");
			map1.put(97, "Keyboad");
			map1.put(17, "Mouse");
			
			
			System.out.println(map1);
			
			System.out.println(map1.firstKey());
			System.out.println(map1.lastKey());
			System.out.println(map1.headMap(90));
			System.out.println(map1.tailMap(90));
//			System.out.println(map1.subMap(70, 90));
			
			
	}

}
