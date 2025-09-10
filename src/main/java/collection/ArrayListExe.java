package collection;

import java.util.ArrayList;

public class ArrayListExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array = new ArrayList();
		array.add(1);
		array.add(89);
		array.add(45);
		System.out.println(array.get(1));
		
		System.out.println( array.contains("2"));
			
		array.remove(0);
		
		for(int x : array) System.out.println(x);
		
		System.out.println( array.contains("1"));
		
		
		array.add(0,50);
		
		for(int x : array) System.out.println(x);
		
	}

}
