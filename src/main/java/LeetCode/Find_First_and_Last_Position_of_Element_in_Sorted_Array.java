package LeetCode;

import javax.swing.*;
import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array
{
    public static void main(String[] args) {
    int[] nums ={5,7,7,8,8,10,};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1) ans[1]=search(nums,target,false);
        return  ans;
    }
    static int search (int[] nums , int target ,boolean findstart)
    {
        int start=0,end=nums.length-1, ans =-1;
        while (start <= end) {
           int mid = start + (end - start) / 2; // Prevents overflow
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (findstart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return  ans;
    }

}
