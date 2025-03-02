package Striver.Pattern;

public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        for (int rows = 0; rows < n; rows++) {
            for (char ch = (char) ('E'-(rows)); ch <='E'; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
