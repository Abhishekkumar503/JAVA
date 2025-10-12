package collection.IdentityHashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key1 = new String("Abhishek");
		String key2 = new String("Abhishek");
		
		Map<String , Integer> map = new HashMap();
		map.put(key1, 1);
		map.put(key2, 2);
		
		System.out.println(map);
		
		/*
		 * {Abhishek=2} 
		 */
		
		
		System.out.println(System.identityHashCode(key1)); //
		System.out.println(System.identityHashCode(key2)); // Both will return different because address is different 
		System.out.println(key1.hashCode()); //
		System.out.println(key2.hashCode()); // Both will return same because value is same 
		Map<String , Integer> map1 = new IdentityHashMap<>();
		map1.put(key1, 1);
		map1.put(key2, 2);
		
		System.out.println(map1);
		
		/*
		 * {Abhishek=2}
			724542711
			498931366
			1472500157
			1472500157
			{Abhishek=2, Abhishek=1}
		 * 
		 */
		
	}

}
