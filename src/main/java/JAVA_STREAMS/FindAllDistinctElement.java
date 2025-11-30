package JAVA_STREAMS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,3,4,4,5,2,1,5,6,7,7,6,8);
		
//		Method 1st - Simply rempve dulpicate
		numbers.stream().distinct().forEach(s-> System.out.println(s));
		
//		Method 2nd - remove duplicate with arrange in ase
		Set<Integer> set = numbers.stream().collect(Collectors.toSet());
		System.out.println(set);
		
//		Method 3rd -- same as Method Second
		Set<Integer> set1 = new HashSet<>(numbers);
		System.out.println(set1);
		
	}

}
