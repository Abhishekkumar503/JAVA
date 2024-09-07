package LeetCode;

public class FindEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896} ;
        System.out.println(findNumbers(nums));
    }

     static public int findNumbers(int[] nums) {
        int count=0;
         for (int i = 0; i < nums.length; i++) {
             if (EvenDigit(nums[i])%2==0)
             {
                 count++;
             }
         }
         return count;
    }

    // Find numdigit is even or not.
    static int EvenDigit(int num) {
        if (num<0)
        {
            num*=-1;
        }
        if (num==0)
            return 1;

        int digcount=0;
        while (num>0)
        {
            num/=10;
            digcount++;
        }
        return digcount;
    }
}