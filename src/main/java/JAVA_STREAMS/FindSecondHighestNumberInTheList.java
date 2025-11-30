package JAVA_STREAMS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumberInTheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> n = Arrays.asList(1,-1,0,-4,2,4,6,3,5,-8,9);	
		
		
		Optional secondHighest = n.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secondHighest.get());
	}

}
