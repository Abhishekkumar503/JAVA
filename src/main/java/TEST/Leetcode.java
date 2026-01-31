package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String input = ")ebc#da@f(";
		
        List<Character> sp = Arrays.asList(
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'
        );
        List<Character> spi = new ArrayList<Character>();
        List<Character> li = new ArrayList<Character>();
        char[] arr = input.toCharArray();
        
       for(int i = 0; i <arr.length;i++)
       {
    	   if(sp.contains(arr[i]))
    		   spi.add(arr[i]);
    	   else
    		   li.add(arr[i]);	   
       }
       Collections.reverse(spi);
       Collections.reverse(li);
       
       System.out.println(spi);
       System.out.println(li);
       
       int spPointer = 0;
       int liPointer = 0;
       for(int i = 0; i < arr.length;i++)
       {
    	   if(sp.contains(arr[i]))
    		  arr[i] = spi.get(spPointer++);
    	   else
    		   arr[i] = li.get(liPointer++);   
       }

        String result = new String(arr);
        System.out.println(result);
	}

}
