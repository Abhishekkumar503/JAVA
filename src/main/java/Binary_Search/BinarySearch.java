package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,9,10,78,98,100,150,183,190,200};
        int target=2;
        System.out.println(Solution(arr,target));
    }

    private static boolean Solution(int[] arr,int target) {
        int start=0,end=arr.length-1 ,mid=(start+end)/2;
        while (start<=end)
        {
            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
            mid=(start+end)/2; // this might exceed the interger range so you can use s+(e-s)/2
        }
        if (target==arr[mid])
            return true;
        return false;
    }
}
