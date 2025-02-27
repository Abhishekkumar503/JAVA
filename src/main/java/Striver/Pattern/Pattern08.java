package Striver.Pattern;

public class Pattern08 {
    public static void main(String[] args) {
        int row=5;
        for (int i = row-1; i >= 0; i--) {
            for(int space = 0; space <row-i-1; space++)
                System.out.print(" ");
            for(int star = 0; star < (2*i)+1; star++ )
                System.out.print("*");
            for(int space = 0; space <row-i-1; space++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
