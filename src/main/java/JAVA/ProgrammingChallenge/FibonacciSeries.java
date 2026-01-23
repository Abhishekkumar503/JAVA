package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num = sc.nextInt();
		System.out.print("Your Fibonacci Series is  : 0,1");
		fib(num); // number is fib elem
		System.out.println();
		System.out.print("Your Fibonacci Series is  : 0,1");
		fib0(num); // fib <= given number
	}

	private static void fib0(int num) {
		// TODO Auto-generated method stub
		int first = 0 ;
		int second = 1 ;
		int third;
		while(first + second < num)
		{
			third = first + second;
			first = second;
			second = third;
			System.out.print("," + third);
		}
	}

	private static void fib(int num) {
		// TODO Auto-generated method stub
		int first = 0 ;
		int second = 1 ;
		int third;
		int i = 2;
		while(i < num)
		{
			third = first + second;
			first = second;
			second = third;
			System.out.print("," + third);
			i++;
		}
	}

}
