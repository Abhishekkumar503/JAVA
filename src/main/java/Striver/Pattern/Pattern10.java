package Striver.Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int rows = 1; rows <= 2*n+1; rows++  )
        {
            int end=0;
            if(rows > n)
                end=2*n-rows;
            else
                end=rows;
            for (int stars = 0; stars < end; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT
*
**
***
****
*****
****
***
**
*
 */