package Prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Find the first non-repeating character in a string
		
		String str = "sandesh";
		Map<Character,Integer> map= new  HashMap<Character,Integer>();
		int count;
		for(int i = 0; i<str.length();i++)
		{
			count=0;
			for(int j = 0; j < str.length(); j++)
			{
				if(str.charAt(i)== str.charAt(j))
					count++;
			}
			map.put(str.charAt(i), count);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.toString());
				break;
			}
		}
		
		

}
}