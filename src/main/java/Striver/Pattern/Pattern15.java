package Striver.Pattern;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int rows = n; rows >= 1; rows--) {
            char alphabet = 65;
            for (int column = 1; column <= rows; column++) {
                System.out.print(alphabet++);
            }
            System.out.println();
        }
    }
}

/*
OUTPUT
ABCDE
ABCD
ABC
AB
A
 */
