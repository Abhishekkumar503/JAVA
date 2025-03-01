package Striver.Pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int number = 1; number <= i; number++) 
                System.out.print(number);
            for (int space = 0; space < 2*(n-i); space++)
                System.out.print(" ");
            for (int reverseNumber = i; reverseNumber >0; reverseNumber--)
                System.out.print(reverseNumber);
            System.out.println();
        }
    }
}

/*
OUTPUT
1      1
12    21
123  321
12344321
 */
