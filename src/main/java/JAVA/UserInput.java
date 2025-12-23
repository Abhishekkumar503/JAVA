package JAVA;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		In JAVA 5 Scanner comes into scope
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Name : ");
		String name = sc.next(); // For input string
		System.out.print("My Name is : " + name);
		int num =sc.nextInt();
		float number = sc.nextFloat();
		double n = sc.nextDouble();
		
	}

}
