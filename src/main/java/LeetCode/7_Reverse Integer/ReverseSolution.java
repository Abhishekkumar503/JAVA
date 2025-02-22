public class ReverseSolution {
    public int reverse(int x) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;


        long reverse = 0;
        boolean isNeg = false;

        //check the number is negative or not, make it abs
        if(x < 0){
            x = Math.abs(x);
            isNeg = true;
        }

        while(x > 0){
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        if(reverse > INT_MAX || reverse < INT_MIN){
            return 0;
        }

        if(isNeg){
            reverse *= -1;
        }
        return (int)reverse;
    }
}