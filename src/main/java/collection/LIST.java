package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LIST {
	
	class MyComparator implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st Way
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Abhishek");
		System.out.println(list.getClass().getName());
		
		//2nd Way : This Means collect all List of elements as LIST
		List<String> list1 = new ArrayList<>();
		System.out.println(list1.getClass().getName());
		
		//3rd Way if you are having array List of elem then Use asList
		Arrays.asList("Abhishek","Uday");
		
		/***************************************/
		
		//now you need to store this List ( only two elem ) In this you cannot Add New Elem 
		//but You Can update the elem
		List<String> List2 = Arrays.asList("Abhishek","Uday");
		System.out.println(List2.getClass().getName());
//		List2.add(0, "Kapil"); // This will return error
		List2.set(0," null "); // Replace the elem
		System.out.println(List2);
		
		//List is a parent and ArrayList is child so you can write like this
//		ArrayList<String> List3 =  Arrays.asList("Abhishek","Uday");
//		System.out.println(List3.getClass().getName());
		
		String[] arrays = {"Array", "List"};
		System.out.println(arrays);
		
		// In this you can not add aswell as not update the list // Even Not Removed
		List<Integer> list4 = List.of(1,2);
//		list4.set(0, 3); // return Exception in thread AWESOME!
		
		
		
/***********************************************************/		
		List<Integer> list5 = new ArrayList<>();
		// Now You can Add the integers
		list5.add(1);
		list5.add(5);
		list5.add(7);
		list5.add(8);
		list5.add(3);
		
		
		//Now make the list of integer 
		List<Integer> list6 = List.of(2,3,5,7);
		// now you cannot Intert the integer of list5 array
//		list6.addAll(list5);
		
		// You can instert only of.list(list6) elem to list list5
		list5.addAll(list6);
		System.out.println(list5);
		
		
		// Remove Elm by Value for Integer
		list5.remove(0); // This means By Index
		System.out.println(list5);
		list5.remove(Integer.parseInt("6")); // This will By Index	
		System.out.println(list5);
		list5.remove(Integer.valueOf(5)); // This will By Value
		System.out.println(list5);
		
/****************************************************************************/
		
//		To Convert the array into new array type
		Integer[] arr =list5.toArray(new Integer[0]); // this will convet array for integer
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		 For Sorting in ASEC
//		Collections.sort(list5);
		list5.sort(null);
		System.out.println(list5);
		
		
//		 For Sorting in ASEC
//		Collections.sort(list5);
//		list5.sort(new MyComparator());
		System.out.println(list5);
	}

}
