package Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
    // create array
        int[] arr={10,43,89,0,123};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        arr[0]=99; // if you make any change in this then reference variable aslo changed.
    }
}
