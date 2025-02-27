package Striver.Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int rows = 0; rows < 2*n+1; rows++  )
        {
            for (int stars = 0; stars < rows+1; stars++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < n-rows-1; spaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
