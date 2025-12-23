package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class SwapToNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Numbers : ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("a : " + a + " &  b : " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("a : " + a + " &  b : " + b);
	}

}
