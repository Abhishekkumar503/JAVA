package JAVA.ProgrammingChallenge;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplicationTableOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scan.nextInt();
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num+" * "+i+" = "+i*num);
			
		}
	}

}
