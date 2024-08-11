package ArraysAndArrayList;

import java.util.Arrays;

public class MAX {
    public static void main(String[] args) {
        int[] arr ={1,434,64,75,23,570};
        System.out.println(Arrays.toString(arr));
        max(arr);
        maxrange(arr,2,5);
    }

    static void maxrange(int[] ar, int start, int end) {
        int max=ar[start];
        for(int i = start; i < end; i++) {
            if(max<ar[i])
            {
                max=ar[i];
            }
        }
        System.out.println("Max : "+max);
    }

    static void max(int[] ar) {
        int max=ar[0];
        for(int i = 1; i < ar.length; i++) {
            if(max<ar[i])
            {
                max=ar[i];
            }
        }
        System.out.println("Max : "+max);
    }
}

/*
OUTPUT
[1, 434, 64, 75, 23, 570]
Max : 570
Max : 75
 */
