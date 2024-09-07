package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,54,76,86,978},
                {432,543,64,2,47,45},
                {31,43,54,78,0}
        };
        int target =01001;
        System.out.println(find(arr,target));
        int[] ans=findByIndex(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static String find(int[][] arr, int target) {

        if (arr.length == 0)
        {
            return "Array not defined !!";
        }

        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]==target)
                {
                    return "Found : "+target;
                }
            }
        }

        return "Not Found!";
    }

    private static int[] findByIndex(int[][] arr, int target) {

        if (arr.length == 0)
        {
            return new int[]{-1,-1};
        }

        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
