package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Arrays of primitives
        int[] num=new int[50];
        for (int i=0;i<num.length;i++)
        {
            num[i]=i;
        }
        for (int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        for(int arr:num)
        {
            System.out.print(arr+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(num)); // the best way

        // Array of object
        Scanner sc=new Scanner(System.in);
        String[] str =new String[50];
        for (int i=0;i<str.length;i++)
        {
            str[i]= String.valueOf(i);
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[0]="START";
        str[49]="END";
        System.out.println(Arrays.toString(str));

    }
}
