package JAVA_STREAMS;

import java.util.Arrays;
import java.util.List;

public class FlattenTheListOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Flatten List means an array is having sub arrays
		List<List<Integer>> listOfList = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9)
				);
//		Use List::Stream inside flatMap
		List<Integer> list = listOfList.stream().flatMap(List::stream).toList();
		System.out.println(list);
				
	}

}
