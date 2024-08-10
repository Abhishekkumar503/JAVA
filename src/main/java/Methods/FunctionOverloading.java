package Methods;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(79);
        fun("Abhishek Kumar");
        fun(12213.35232241325);
        fun('a');

        
    }

    private static void fun(int i) {
        System.out.println(i);
    }
    private static void fun(String arr) {
        System.out.println(arr);
    }
    private static void fun(double d) {
        System.out.println(d);
    }
    private static void fun(char c) {
        System.out.println(c);
    }
}
