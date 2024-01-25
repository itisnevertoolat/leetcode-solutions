class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i: candyType)
            set.add(i);
        int x = candyType.length / 2;
        if(x >= set.size())
            return set.size();
        else
            return x;
        
        
    }
}