package LeetCode.Array.Medium;

public class Number_of_Subarrays_With_Odd_Sum_1524 {

    class Solution {
        public int numOfSubarrays(int[] arr) {

        /*
        Optimal Approach
         */

//            int len = arr.length;
//            int count = 0;
//            int mod = (int) 1e9 + 7;
//            for (int i = 0; i < len; i++) {
//                int sum = 0;
//                for (int j = i; j < len; j++) {
//                    sum += arr[j];
//                    if (sum % 2 != 0)
//                        count++;
//                }
//
//            }
//            return count % mod;

            /*
        Bruteforce Approach
         */


            int mod = (int) 1e9 + 7;
            int count = 0;
            int sum = 0;
            int evenCount = 1;
            int oddCount = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (sum % 2 == 0) {
                    count = (count + oddCount) % mod;
                    evenCount++;
                } else {
                    count = (count + evenCount) % mod;
                    oddCount++;
                }
            }
            return count % mod;

        }
    }





}
