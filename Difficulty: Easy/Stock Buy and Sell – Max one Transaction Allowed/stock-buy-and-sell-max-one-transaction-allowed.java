// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>=buy) {
                profit=Math.max(profit,prices[i]-buy);
            }
            else {
                buy=prices[i];
            }
        }
        return profit;
    }
}