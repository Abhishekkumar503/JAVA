package Striver.Pattern;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int counter = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= rows; column++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
