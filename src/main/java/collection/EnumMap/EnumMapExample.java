package collection.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT
		
		Map<Day, String> map = new EnumMap<>(Day.class);
		map.put(Day.Wednesday, "Walk");
		map.put(Day.Friday ,"Club");
		map.put(Day.Monday, "Temple");
		map.put(Day.Sunday, "Party");
		
		System.out.println(map);
		
	}
	

}

enum Day {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}