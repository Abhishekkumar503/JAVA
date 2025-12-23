package JAVA;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Hello World!");
		
		int n = 9;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = n; j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

		System.out.println();
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
