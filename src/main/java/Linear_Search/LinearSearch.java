package Linear_Search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        int[] nums={12,23,34,545,76,87,9,3453,2,55,34,654};
        int target=3453;
        System.out.println("Index : "+linearSearch(nums,target));
    }

    // Search the element if found
    static int linearSearch(int[] arr ,int target)
    {
        //if array is blank
        if(arr.length==0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)
            {
                return i;
            }
        }
        // if element not exist
        return -1;
    }
}

/*
OUTPUT
Index : 7
 */
