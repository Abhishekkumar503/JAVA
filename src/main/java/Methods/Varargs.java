package Methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        // varable number of argument
        fun(1,2,3,4,56,7,7,8,4,2,7);

    }
    static void fun(int ...v) // variable length argumet come at the end.
    {
        System.out.println(Arrays.toString(v));
    }
}
