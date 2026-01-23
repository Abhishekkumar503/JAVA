package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class ReverseTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num = sc.nextInt();
		System.out.println("Your reverse number is  : " + reverse(num));
	}

	private static int reverse(int num) {
		// TODO Auto-generated method stub
		int reverse = 0;
		while(num > 0)
		{
			reverse *= 10;
			reverse += num % 10;
			num = num / 10;
		}
		return reverse;
	}

}
