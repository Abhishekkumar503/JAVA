package ArraysAndArrayList;

public class ColNoFixSize {
    public static void main(String[] args) {
        int[][] MultDimArr1={
                {1,2},
                {3,4,5,6},
                {7,8,9},
                {10}
        };
        // Normal way to displayed
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < MultDimArr1[i].length; j++) {
                System.out.print(MultDimArr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
