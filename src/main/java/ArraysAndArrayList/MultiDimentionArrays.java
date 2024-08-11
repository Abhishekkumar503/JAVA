package ArraysAndArrayList;

import java.util.Arrays;

public class MultiDimentionArrays {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
         */

        int[][] arr=new int[3][3];
        int[][] MultDimArr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(MultDimArr[i][j]+" ");
            }
            System.out.println();
        }
        //Another Matrix
        int[][] MultDimArr1={
                {1,2},
                {3,4,5,6},
                {7,8,9},
                {10}
        };
        // Normal way to displayed
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < MultDimArr1[i].length; j++) {
                System.out.print(MultDimArr1[i][j]+" ");
            }
            System.out.println();
        }
        // enhanced way to displayed
        for (int i = 0; i < MultDimArr1.length; i++) {
            System.out.println(Arrays.toString(MultDimArr1[i]));
        }
        for (int[] a :MultDimArr){
            System.out.println(Arrays.toString(a));
        }

        //String Matrix
        String[][] str={
                {" ","A", " "},
                {"B","C","D"},
                {"E","F","G","H"}

        };
        for (String[] ele : str)
            System.out.println(Arrays.toString(ele));

    }
}
