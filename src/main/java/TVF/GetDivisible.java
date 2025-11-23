package TVF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("The Divisble of a given number are : " + checkArmstrong(num));
	}

	private static List<Integer>  checkArmstrong(int num) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		for(int i= 1 ; i < num ; i++)
		{
			if(num % i == 0)
				list.add(i);
		}
		System.out.println(list);
		return list;
	}


}
