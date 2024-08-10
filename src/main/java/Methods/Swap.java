package Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a ,b;
        System.out.print("Enter two number for Swapping : ");
        a=scan.nextInt();
        b=scan.nextInt();
        Swap(a,b);

        // JAVA refernce only PASS BY VALUEs
//        // swap with third variable
//        int temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println(" Your Swaped number : a = "+a+", b = "+b);

    }
    static void Swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(" Your Swaped number : a = "+a+", b = "+b);
    }
}
