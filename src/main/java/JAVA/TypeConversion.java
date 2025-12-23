package JAVA;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Implicit Conversion
		float num = 5; // here I'm passing int value into float
		System.out.println(num);
		
//		Explicit Conversion
		 int n = (int)1000000000.0d; // Here I'm passing big float/double value into int
		System.out.println(n);
	}

}
