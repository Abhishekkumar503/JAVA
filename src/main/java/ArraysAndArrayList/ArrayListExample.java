package ArraysAndArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<>(10);
        Arr.add(13);
        Arr.add(313);
        Arr.add(132);
        Arr.add(131);
        System.out.println( Arr.contains(13));
        System.out.println(Arr);
        Arr.remove(2);
        System.out.println(Arr);

        for (int i = 0; i < Arr.size(); i++) {
            System.out.println(Arr.get(i));
        }
    }
}
