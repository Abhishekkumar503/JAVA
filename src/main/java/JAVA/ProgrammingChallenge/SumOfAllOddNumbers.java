package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class SumOfAllOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Nth number : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while(i <= num)
		{
			sum += (i % 2 != 0) ? num : 0 ;
			i++;
		}
		System.out.println("Sum of all odd Numbers : "+sum);
	}

}
