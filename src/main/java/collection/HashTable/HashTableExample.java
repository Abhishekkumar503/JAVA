package collection.HashTable;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(1,"Abhishek");
		table.put(2,"udai");
		
		System.out.println(table);
		
		table.put(3,"Archit");
		table.put(4,"Ajay");
		
		System.out.println(table); */
		
		
		Hashtable<Integer, String> map = new Hashtable<>();
		
		Thread thread = new Thread(()-> {
			for(int i = 0 ; i<= 1000; i++)
			{
				map.put(i,"Thread");
			}
		});
		
		Thread thread1 = new Thread(()-> {
			for(int i = 1000 ; i <= 2000; i++)
			{
				map.put(i,"Thread");
			}
		});
		
		thread.start();
		thread1.start();
		System.out.println(map.size());
	}

}
