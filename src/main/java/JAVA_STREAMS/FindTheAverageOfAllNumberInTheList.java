package JAVA_STREAMS;

import java.util.Arrays;
import java.util.List;

public class FindTheAverageOfAllNumberInTheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,3,4,4,5,2,1,5,6,7,7,6,8);

//		First create Stream of integer then we need to change the integer to int withthe help of mapToInt at last use Average.
		System.out.println(numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0));
		
	}

}
