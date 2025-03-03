package Striver.Pattern;

public class Pattern22 {
    public static void main(String[] args) {
        int n=4;
        for (int rows = 0; rows < 2*n-1; rows++) {
            for (int colums = 0; colums < 2*n-1; colums++) {
                if (rows == 0 || colums == 0 || rows == n-1 || colums == n-1)
                    System.out.print("4");
                else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
