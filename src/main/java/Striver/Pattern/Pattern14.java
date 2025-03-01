package Striver.Pattern;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int rows = 1; rows <= n; rows++) {
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
A
AB
ABC
ABCD
ABCDE
 */