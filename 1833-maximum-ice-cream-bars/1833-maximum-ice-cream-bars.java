class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for(int i= 0;i<costs.length;i++){
            coins -= costs[i];
            if(coins >= 0)
                res++;
            else
                break;
        }
        return res;
    }
}