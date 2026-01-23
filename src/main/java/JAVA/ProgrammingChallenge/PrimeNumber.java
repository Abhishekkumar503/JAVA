package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num = sc.nextInt();
		System.out.println("Your number is prime  : " + prime(num));
	}

	private static boolean prime(int num) {
		// TODO Auto-generated method stub
		int i = 2;
		while(i < num)
		{
			if(num % i == 0)
				return false;
			i++;
		}
		return true;
	}

}
