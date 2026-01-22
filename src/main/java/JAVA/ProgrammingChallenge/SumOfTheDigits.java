package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		int sum = 0;
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
		System.out.println("Your number Sum is : " + sum);
	}

}
