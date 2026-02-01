package Prep;

public class MissingNumberFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Find the missing number in an array from 1 to N
		
		int[] arr = {'1','3','4','9'};
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			if(arr[start] != (start+1))
				System.out.println(start+1);
			start++;
		}
		
	}

}
