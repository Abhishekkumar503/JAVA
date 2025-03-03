package Striver.Pattern;

public class Pattern19 {
    public static void main(String[] args) {
        int n=3;
        for (int rows = 0; rows < n; rows++) {
            for (int stars = 0; stars < n-rows; stars++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2*rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < n-rows; stars++) {
                System.out.print("*");
            }
            if(rows!=n-1) System.out.println();
        }
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
    }
}
