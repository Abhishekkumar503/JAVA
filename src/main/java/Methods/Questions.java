package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //To chech wether prime or not
       // System.out.println(isPrime(sc.nextInt()));
       isArmstrong();


    }
    //Print 3 digit armstromg number
    private static void isArmstrong() {

        for (int j=100;j<999;j++)
        {
            int isArm=0;
            int orginal=j;

        while(orginal>0)
        {
            int temp=orginal%10;
            isArm+=temp*temp*temp;
            orginal/=10;
        }

            if(isArm==j)
                System.out.println(j+" ");
        }
    }

//    private static boolean isPrime(int i) {
//        if(i<=1)
//            return false;
//        int c=2;
//        while (c*c<=i)
//        {
//            if(i%c==0)
//                return false;
//            c++;
//        }
//        return c*c>i;
//    }
}
