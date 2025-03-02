package Striver.Pattern;

public class Pattern17 {
    public static void main(String[] args) {
        int row=5;
        for (int i = 0; i < row ; i++) {
            for(int space = 0; space <row-i-1; space++)
                System.out.print(" ");
            char alphabet=65;
            for(int alpha = 0; alpha < (2*i)+1; alpha++ ) {
                if (alpha < ((2 * i) + 1)/2) System.out.print(alphabet++);
                else System.out.print(alphabet--);
            }
            for(int space = 0; space <row-i-1; space++)
                System.out.print(" ");
            System.out.println();
        }
    }
}

/*
OUTPUT
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */
