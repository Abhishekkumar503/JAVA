package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class GreatestCommonDivisorGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int first = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int second = sc.nextInt();
		int gcd = findGCD(second,first);
		System.out.println("GCD is : " + gcd);
	}

	private static int findGCD(int second, int first) {
		// TODO Auto-generated method stub
		int i = 2;
		int gcd = 1;
		int least = Math.min(first, second);
		while (i <= least)
		{
			if(first % i == 0 && second % i == 0)
			{
				gcd = i;
			}
			i++;
		}
		return gcd;
	}

}
