package JAVA_STREAMS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfIntegerInAseAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,3,4,4,5,2,1,5,6,7,7,6,8);
		
//		In ASE order
		System.out.println(numbers.stream().sorted().toList());
		
//		In DESC order
		System.out.println(numbers.stream().sorted((a,b) -> b.compareTo(a)).toList());
		
		System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList());
	}

}
