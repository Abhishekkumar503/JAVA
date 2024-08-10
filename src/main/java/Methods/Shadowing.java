package Methods;

public class Shadowing {
    static  int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x=70;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }

}

//90
//70
//90
