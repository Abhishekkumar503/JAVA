package JAVA;

import java.util.Scanner;

public class AddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int nums = 0;
		System.out.println("Welcome to Calculator");
		System.out.println("Enter first Number : ");
		nums = scan.nextInt();
		System.out.println("Enter second Number : ");
		nums += scan.nextInt();
		
		System.out.println("Your Sum of two numbers are : "+nums);
	}

}
