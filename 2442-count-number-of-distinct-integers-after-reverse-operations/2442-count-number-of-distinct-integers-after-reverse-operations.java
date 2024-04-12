class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
            set.add(reverseNum(i));
        }
        return set.size();
            
        
        
    }
    public int reverseNum(int x){
        StringBuilder sb = new StringBuilder();
        while (x > 0){
            sb.append(x % 10);
            x /= 10;
        }
        return Integer.parseInt(sb.toString());

    }
}
