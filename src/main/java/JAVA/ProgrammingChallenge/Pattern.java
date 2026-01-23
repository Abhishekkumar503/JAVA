package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		Pattern01(num);
		System.out.println();
		System.out.println();
		Pattern02(num);
		System.out.println();
		System.out.println();
		Pattern03(num);
	}

	private static void Pattern03(int num) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= 2 * (num - i); j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void Pattern02(int num) {
		// TODO Auto-generated method stub
		for(int i = 0; i < num; i++)
		{
			for(int j = num - i; j > 0 ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void Pattern01(int num) {
		// TODO Auto-generated method stub
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
