package JAVA_STREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNonEmptyStringInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruites = 
				Arrays.asList("Apple","Banana","Carret","","Elichi","Berry","");
		
		Optional<String> op = fruites.stream().filter(s -> !s.isEmpty()).findFirst();
 		System.out.println(op.get());
		
	}

}
