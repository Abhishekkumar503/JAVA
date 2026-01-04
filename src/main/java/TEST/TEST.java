package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3};
//		
//		int ans = 0 , len = digits.length -1 , k;
//        for(int n : digits)
//        {
//        	ans *= 10;
//            ans += n;
//        	
//        }
//        System.out.println(ans);
//        ans++;
//        
//        System.out.println(ans);
		
	
        
//        int[] nums = {2,2};
//		HashSet<Integer> set = new HashSet<>();
//        for(int num : nums)
//        {
//            set.add(num);
//        }
//        System.out.println(set.stream().limit(3).collect(Collectors.toList()).reversed().get(set.size()-1));
//        
//		int[] nums = {1,0,1,1,0,1};
//		System.out.println(findMaxConsecutiveOnes(nums));
//        
//	}
//	public static int findMaxConsecutiveOnes(int[] nums) {
//      
//		int count = 0 , c=0;
//        for(int i = 0 ; i <  nums.length ; i++)
//        {
//        if(nums[i] == 1)
//        count++;
//        else if(nums[nums.length-1] == 1)
//        {
//        nums[i] = count+1;
//       
//        }
//        else
//        {
//        nums[i] = count;
//        count = 0;
//        }
//        }
//        for(int n : nums)
//        System.out.println(n);
//        System.out.println();
//        return Arrays.stream(nums).max().getAsInt();
//
//    }
		
		
	System.out.println(minOperations(digits));
	
	System.out.println(reversePrefix("abcd",2));
	}
	


	
public static int minOperations(int[] nums) {
int count = 0;
	HashSet<Integer> set = new HashSet<>();
	for(int n : nums)
	{
		if(!set.add(n))
		{
			count++;
		}
		
	}
	return count;
        
    }

public static String reversePrefix(String s, int k) {
    char[] str = s.toCharArray();

    if (k == s.length()) {
        reverse(str);
    } else {
        int start = 0;
        int end = k - 1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    return new String(str);
}

public static void reverse(char[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

}
