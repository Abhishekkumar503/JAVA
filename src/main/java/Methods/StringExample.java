package Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        System.out.println(Greet());

        Scanner name=new Scanner(System.in);
        System.out.print("Enter your name : ");

        String personalized = myGreat(name.next());
        System.out.println(personalized);
    }
     static String myGreat(String name) {
        String message="Hello "+name;
        return message;
    }

//    static String Greet()
//    {
//        String greeting="Hi, how are you!";
//       return greeting;
//    }

}
