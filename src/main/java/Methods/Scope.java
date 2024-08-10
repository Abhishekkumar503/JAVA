package Methods;

public class Scope {
    public static void main(String[] args) {
    int a=10;
    int b=9;

        {
            a=79; // no need to re initailze.
            int c=67;

        }
       int c=56; // you have to initailize out to use.
    }
}
