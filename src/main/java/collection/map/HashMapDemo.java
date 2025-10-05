package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Abhishek");
		map.put(2, "Sandesh");
		map.put(3, "Goldie");
		map.put(4, "Kanika");
		map.put(5, "Udai");
		
		System.out.println(map);
		
		System.out.println(map.get(2));
		System.out.println(map.get(21));
		System.out.println(map.containsKey(23));
		System.out.println(map.containsValue("Abhishek"));
		System.out.println();
		System.out.println();
		
		// For Iteration with help of Keyset GETTER
		Set<Integer> str = map.keySet();
		for(Integer i : str)
		{
			System.out.println(map.get(i));
		}
		
		// for entrySet LIKE SETTER
		
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		for (Map.Entry<Integer,String> entry : entries) {
			entry.setValue(entry.getValue().toUpperCase());
		}
		
		System.out.println(map);
		
		map.remove(2);
		System.out.println(map);
	}

}
