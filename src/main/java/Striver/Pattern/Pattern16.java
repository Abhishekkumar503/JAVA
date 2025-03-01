package Striver.Pattern;

public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        char alphabet=65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet);
            }
            System.out.println();
            alphabet++;
        }
    }
}

/*
OUTPUT
A
BB
CCC
DDDD
EEEEE
 */
