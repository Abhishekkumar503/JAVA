package BitwiseOperator;

import java.util.Scanner;

public class EvenOddBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Even/Odd calculator");
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String result = ((num & 1) == 1)?"Number is Odd":"Number is Even";
		System.out.println(result);
	}

}
