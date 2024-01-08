class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int x = prices[0] + prices[1];
        if( x <= money)
            return money - x;
        return money;
        
    }
}