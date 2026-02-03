package Prep;

public class ReverseAStringWithOutUsingLibrarymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Reverse a string without using library methods

		String str = "Null";
		int len = str.length();
	    char[] ch = str.toCharArray();	
	    char[] chr = new char[len] ;
	    int c = 0;
	    for(int i =len - 1; i >= 0;i-- )
	    {
	    	chr[c++] = ch[i];
	    }
	    
	    System.out.println(new String(chr));
	    
	    // By While loop SP : O(1) 
	    
	    int strLen = str.length();
	    int fisrtIndex = 0;
	    int lastIndex = strLen - 1;
	    char[] strChar = str.toCharArray();
	    while(fisrtIndex <= lastIndex)
	    {
	    	char temp = strChar[fisrtIndex];
	    	strChar[fisrtIndex] = strChar[lastIndex];
	    	strChar[lastIndex] = temp;
	    	fisrtIndex++;
	    	lastIndex--;
	    }
	    
	    System.out.println(new String(strChar));
	}

}
