package JAVA_STREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllStringIntoSingleCommaSeperated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruites = 
				Arrays.asList("Apple","Banana","Carret","DragonFruite","Elichi","Berry","Avacardo");
//		Use of Collector
		String f = fruites.stream().collect(Collectors.joining(","));
		System.out.println(f);
	}
}

