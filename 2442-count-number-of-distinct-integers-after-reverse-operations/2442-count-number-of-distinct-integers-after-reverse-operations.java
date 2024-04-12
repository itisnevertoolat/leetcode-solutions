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
        StringBuffer string 
            = new StringBuffer(String.valueOf(x));
        string.reverse(); 

        return Integer.parseInt(String.valueOf(string));

    }
}
