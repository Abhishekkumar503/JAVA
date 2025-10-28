package collection.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableMap<String, Float> map = new TreeMap();
		map.put("MAC", 125000f);
		map.put("Ipad", 70000f);
		map.put("Iphone 17 pro max", 176000f);
		map.put("Airpods", 25600f);
		
		
		System.out.println(map);
		System.out.println(map.ceilingKey("Ipad"));
		System.out.println(map.higherKey("Ipad"));
		System.out.println(map.tailMap("Airpods"));
	}

}
