package Binary_Search.InterviewPrep;

public class FindElementInInfiniteArray {
    // in this we are reverse the Binary search
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/?ref=gcse_ind
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(ans(arr,10));
    }
    static int ans(int[] arr , int target)
    {
        //First find the range
        // first start with a box of size 2
        int start=0;
        int end=1;

        //
        while(target>arr[end])
        {
            int temp=end+1; // my new start
            //double the box value
            //end= previousend + sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;

        }
        return BinarySearch(arr,target,start,end );
    }

    private static int BinarySearch(int[] arr, int target, int start, int end) {
        int mid=start+(end-start)/2;
        while(start<=end)
        {
             mid=start+(end-start)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}
