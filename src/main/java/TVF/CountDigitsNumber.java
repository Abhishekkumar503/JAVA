package TVF;

import java.util.Scanner;

public class CountDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("The Count of the Digit in Number : " + DigitCount(num));
		
		System.out.print("Enter Number : ");
		int num2 = sc.nextInt();
		System.out.println("The Count of the Digit in Number : " + DigiCount(num2));
		
	}

	private static int DigitCount(int num) {
		// TODO Auto-generated method stub
		return  (int)(Math.log10(num)+1);
	}
	private static int DigiCount(int num)
	{
		int count = 0;
		while(num > 0 )
		{
			num/= 10;
			count++;
		}
		return count;	
	}
}
