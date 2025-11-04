package TVF;

import java.util.Scanner;

public class ReverseADigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("The Reverse of the Digit of Number : " + reverseADigit(num));
	
	}

	private static int reverseADigit(int num) {
		// TODO Auto-generated method stub
		int reverse = 0 , digi = 0;
		
	while ( num > 0)
	{
		digi = num % 10;
		reverse = reverse * 10 + digi;
		num/=10;
	}
		return reverse;
	}

}
