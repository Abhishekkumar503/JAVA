import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("The Sum of two number is : "+ sum());
    }
    static double sum(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1=sc.nextDouble();
        System.out.println("Enter number 2: ");
        double num2=sc.nextDouble();
        return num1+num2;
    }
}
