package Striver.Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int binary = 1;
        for (int rows = 0; rows <5; rows++) {
            if(rows % 2 == 0) binary = 1;
            else binary = 0;
            for (int j = 0; j <= rows; j++) {
                System.out.print(binary+" ");
                binary= 1 - binary;
            }
            System.out.println();
        }
    }
}

/*
OUTPUT
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */