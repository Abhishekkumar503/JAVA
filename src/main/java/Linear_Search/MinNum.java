package Linear_Search;

public class MinNum {
    public static void main(String[] args) {
        int[] nums={12,23,34,545,76,87,9,3453,2,55,34,654};
        System.out.println(MinNumSearch(nums));
    }

    private static int MinNumSearch(int[] nums) {

       int minNum=nums[0];
       for (int min :nums){
           if (minNum>min)
           {
               minNum=min;
           }
       }
       return minNum;
    }
}

/*
OUTPUT
2
 */
