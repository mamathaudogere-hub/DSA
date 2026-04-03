//.........Best Time to Buy and Sell Stock........(121-leetcode)

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int p=0, mini=prices[0];
        for(int i=1;i<n;i++){
            int cost=prices[i]-mini;
            p=Math.max(p,cost);
            mini=Math.min(mini,prices[i]);
        }
        return p;
    }
}