package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("Your number is Armstrong  : " + (isArmstrong(num) == num ? "True" : "False"));
	}

	private static int isArmstrong(int num) {
		// TODO Auto-generated method stub
		int len = length(num);
		int arm = 0;
		int digit ;
		while(num > 0)
		{
			digit = num % 10;
			arm += Math.pow(digit, len);
			num /= 10;
		}
		return arm;
	}

	private static int length(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num > 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}

}
