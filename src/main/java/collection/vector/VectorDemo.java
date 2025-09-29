package collection.vector;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector vector = new Vector(2,3);
        System.out.println(vector.capacity()); 
        
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        
        System.out.println(vector.capacity());
        
        /*******
         2
2
5
8
11
14
         *******/
        
        
        
        
    }
}
