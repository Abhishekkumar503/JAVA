package Binary_Search.InterviewPrep;

public class FindCeilingOfTheNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,9,10,78,98,100,150,183,190,200};
        int[] arr2={1,2,4,7,87,98};//,5,7,9,10,78,98,100,150,183,190,200};
        int[] arr1={500,450,430,300,280,200,156,99,88,74,65,45,38,21,16,8,5,1,0,-5};
        int target=5;
        System.out.println(Ceiling(arr,target));
        System.out.println(CeilingV2(arr2,target));
    }

    private static int CeilingV2(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        // If the target is greater than the largest element
        if (target > arr[arr.length - 1]) {
            return -1; // No ceiling exists
        }

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents overflow

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found, return its value
            }
        }
        // Start now points to the smallest element greater than the target
        return arr[start];
    }


    static int Ceiling(int[] arr ,int target)
    {
        try {
            int start = 0, end = arr.length - 1, mid = start + (end - start) / 2;
            while (start <= end) {
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
                mid = start + (end - start) / 2;
            }
            if (arr[start]>=target)
                return arr[start];
        }
        catch (ArrayIndexOutOfBoundsException  e)
        {
            System.out.println("Index out of bounds for length ");
        }
        return Integer.MIN_VALUE;
    }
}
