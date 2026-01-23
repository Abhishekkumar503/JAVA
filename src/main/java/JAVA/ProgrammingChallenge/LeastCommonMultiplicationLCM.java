package JAVA.ProgrammingChallenge;

import java.util.Scanner;

public class LeastCommonMultiplicationLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int first = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int second = sc.nextInt();
		int lcm = findLCM(second,first);
		System.out.println("LCM is : " + lcm);
	}

	private static int findLCM(int small, int large) {
		// TODO Auto-generated method stub
		int i = 1;
		while(true)
		{
			int factor = small * i;
			if(factor % large == 0)
				return factor;
			i++;
		}
	}

}
