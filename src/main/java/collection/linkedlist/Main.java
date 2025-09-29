package collection.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] Args)
{
		// TODO Auto-generated method stub

		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("HI THERE Lets add some data.");
		
		for(int i = 0 ; i < 100 ; i ++)
			linkedlist.add(i, String.valueOf(i+1));
		
		for(int i = 0 ; i < 100 ; i ++)
		System.out.println(linkedlist.get(i));
		
		
		LinkedList<String> animal = new LinkedList<String>(Arrays.asList("Dog","Cat"));
		LinkedList<String> animalToRemove = new LinkedList<String>(Arrays.asList("Cat"));
		
		animal.removeAll(animalToRemove);
		
		System.out.println(animal);
		
		
	}
}
