package Striver.Pattern;

public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        for (int rows = n; rows >= 0 ; rows--) {
            for (int stars = 0; stars < n-rows; stars++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2*rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < n-rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int inverseRows = 1; inverseRows <= n; inverseRows++) {
            for (int stars = 0; stars < n-inverseRows; stars++) {
                System.out.print("*");
            }
            for (int spaces = 2*inverseRows; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < n-inverseRows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */