package JAVA_STREAMS;

import java.util.Arrays;
import java.util.List;

public class CountHowManyStringsStartsWithSpecificCharacterLikeA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruites = 
				Arrays.asList("Apple","Banana","Carret","DragonFruite","Elichi","Berry","Avacardo");
		
		System.out.println(fruites.stream().filter(f -> f.startsWith("B")).toList());
	}

}
