package JAVA.ProgrammingChallenge;

import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		long fact = 1;
		int i=1;
		while(i <= num)
		{
			fact *= i;
			i++;
		}
		System.out.println("your factorial : "+ fact);
	}

}
