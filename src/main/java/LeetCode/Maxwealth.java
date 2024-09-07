package LeetCode;
/*
1672. Richest Customer Wealth
 */
public class Maxwealth {
    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

       static public int maximumWealth(int[][] accounts) {
            int wealthOfCutomer , richcount=0;
            for (int Customer = 0; Customer <accounts.length  ; Customer++) {
                wealthOfCutomer=0;
                for (int wealth = 0; wealth < accounts[Customer].length; wealth++) {
                    wealthOfCutomer+=accounts[Customer][wealth];
                }
                if (wealthOfCutomer>richcount)
                        richcount=wealthOfCutomer;
            }
            return richcount;
       }
}
/*
OUTPUT
6
 */