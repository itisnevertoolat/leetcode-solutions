class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        // get the maximum cost available
        int max = costs[0];
        for (int i = 0; i < costs.length; i++) {
            max = Math.max(costs[i], max);
        }
        // create the bucket array of size of maximum_cost + 1
            // and keep the frequencies of the cost
        int[] buckets = new int[max + 1];
        for (int p : costs) {
            buckets[p]++;
        }

        // keep the track of maximum ice-creams can be bought
        int ans = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (coins < i) {
                break;
            }
            if (buckets[i] > 0) {
                ans += Math.min(buckets[i], coins/i);
                coins -= Math.min(coins, i * buckets[i]);
            }
        }
        return ans;
    }
}
// class Solution {
//     public int maxIceCream(int[] costs, int coins) {
//         Arrays.sort(costs);
//         int res = 0;
//         for(int i= 0;i<costs.length;i++){
//             coins -= costs[i];
//             if(coins >= 0)
//                 res++;
//             else
//                 break;
//         }
//         return res;
//     }
// }