package collection.copyatwrite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyAtWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
	
		/*List<String> list =new  ArrayList<>();
		list.add("BANANA");
		list.add("APPLE");
		list.add("GRAPES");
		for (String string : list) {
			System.out.println(string);
			if(string.equals("APPLE"))
				list.add("JUICE");
		}
		System.out.println(list); */
		
		List<String> list =new  CopyOnWriteArrayList<>();
		list.add("BANANA");
		list.add("APPLE");
		list.add("GRAPES");
		for (String string : list) {
			System.out.println(string);
			if(string.equals("APPLE"))
				list.add("JUICE");
		}
		System.out.println(list);
		
		Thread readThread = new Thread(() -> {
		    try {
		        Thread.sleep(500);
		        int i = 0;
		        while (i < list.size()) {
		            String string = list.get(i);
		            System.out.println(string);
		            if (string.equals("GRAPES"))
		                list.add("ThreadJUICE");
		            i++;
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		});
		readThread.start();

		System.out.println(list);
	}

}
