class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
            set.add(reverseNum(i));
        }
        return set.size();
            
        
        
    }
    public int reverseNum(int n){
            int val = 0;
            while(n > 0){
                val = val * 10 + (n % 10);
                n /= 10;
            }
            return val;
//         StringBuffer string 
//             = new StringBuffer(String.valueOf(x));
//         string.reverse(); 

//         return Integer.parseInt(String.valueOf(string));

    }
}
