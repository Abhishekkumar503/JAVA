package ArraysAndArrayList;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr ={1,434,64,75,23,57,78};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            start++;
            end--;
        }
    }
}
/*
OUTPUT
[1, 434, 64, 75, 23, 57, 78]
[78, 57, 23, 75, 64, 434, 1]
 */