package TEST;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3};
		
		int ans = 0 , len = digits.length -1 , k;
        for(int n : digits)
        {
        	ans *= 10;
            ans += n;
        	
        }
        System.out.println(ans);
        ans++;
        
        System.out.println(ans);
        
	}

}
