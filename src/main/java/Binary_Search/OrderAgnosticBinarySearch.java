package Binary_Search;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,9,10,78,98,100,150,183,190,200};
        int[] arr1={500,450,430,300,280,200,156,99,88,74,65,45,38,21,16,8,5,1,0,-5};
        int target=1;
        System.out.println(OABS(arr,target));
        System.out.println(OABS(arr1,target));
    }
    static int OABS(int[] arr ,int target)
    {
        int start=0,end=arr.length-1 ;
        // to find weather arr is ascending serortes?
        boolean isSort=arr[start]<arr[end];
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target==arr[mid])
                return mid;
            if(isSort)
            {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else
            {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return -1;
    }
}
