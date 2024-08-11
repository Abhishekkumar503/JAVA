package ArraysAndArrayList;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        //Strings are immutable in JAVA and Arrays are mutable in Java
        int[] arr={1,4,56,75,85};
        System.out.println(Arrays.toString(arr));
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] arrgs)
    {
        arrgs[0]=99;
    }
}
