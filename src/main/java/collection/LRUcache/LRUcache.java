package collection.LRUcache;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUcache<K,V> extends LinkedHashMap<K, V>{
	
	private int capacity;
	

	public LRUcache(int capacity) {
		super(capacity,0.75f,true);
		this.capacity = capacity;
	}

	

	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size() > capacity;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LRUcache<String , Integer> studentMap = new LRUcache<String, Integer>(4);
		studentMap.put("A", 1);
		studentMap.put("B", 5);
		studentMap.put("C", 4);
		studentMap.put("D", 3);
		studentMap.get("A");
		studentMap.put("E", 2);
		
		
		
		System.out.println(studentMap);
	}

}
