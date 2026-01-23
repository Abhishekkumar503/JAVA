package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("Your Number is Palindrom  : " + (isPalindrome(num) == num ? "True" : "False"));
	}

	private static int isPalindrome(int num) {
		// TODO Auto-generated method stub
		int palin = 0 ;
		while(num > 0)
		{
			palin *= 10;
			palin += num % 10;
			num /= 10;
		}
		return palin;
	}

}
