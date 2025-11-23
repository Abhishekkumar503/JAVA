package TEST;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] digits = {1,2,3};
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
		int[] nums = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
        
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , c=0;
        for(int i = 0 ; i <  nums.length ; i++)
        {
        if(nums[i] == 1)
        count++;
        else if(nums[nums.length-1] == 1)
        {
        nums[i] = count+1;
       
        }
        else
        {
        nums[i] = count;
        count = 0;
        }
        }
        for(int n : nums)
        System.out.println(n);
        System.out.println();
        return Arrays.stream(nums).max().getAsInt();

    }
	

}
