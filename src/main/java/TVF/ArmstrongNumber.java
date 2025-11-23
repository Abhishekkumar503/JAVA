package TVF;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("The Given number is Armstrong : " + checkArmstrong(num));
	}

	private static boolean checkArmstrong(int num) {
		// TODO Auto-generated method stub
		int len = String.valueOf(num).length();
		int sum = 0 , digi = 0 , copyNum = num;
		while (copyNum > 0 )
		{
		digi = copyNum % 10	;
		sum += Math.pow(digi, len);
		copyNum /= 10;
		}
		return (sum == num ? true : false);
	}

}
