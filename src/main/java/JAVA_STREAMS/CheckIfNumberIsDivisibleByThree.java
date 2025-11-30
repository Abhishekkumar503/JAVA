package JAVA_STREAMS;

import java.util.Arrays;
import java.util.List;

public class CheckIfNumberIsDivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> n = Arrays.asList(1,-1,0,-4,2,4,6,3,5,-8,9);	
		
//		With the help of AnyMatch you can findout your required o/p
		System.out.println(n.stream().anyMatch(num -> num % 3 == 0));
	}

}
