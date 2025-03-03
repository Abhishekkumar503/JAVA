package Striver.Pattern;

public class Patrtern21 {
    public static void main(String[] args) {
        int n=4;
        for (int rows = 0; rows < n; rows++) {
            for (int column = 0; column < n; column++) {
                if(rows==0 || rows == n - 1 || column == 0 || column == n - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT

****
*  *
*  *
****
 */
