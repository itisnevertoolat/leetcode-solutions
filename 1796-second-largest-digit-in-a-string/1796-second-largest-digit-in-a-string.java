class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for(char c: s.toCharArray()){
            int x = c;
            if((x >= 97 && x <= 122) )
                continue;
            set.add(c-'0');
        }
            
        if(set.size() <= 1)
            return -1;
        int[] arr = new int[set.size()];
        int count = 0;
        for(int i: set)
            arr[count++] = i;
        Arrays.sort(arr);
        return arr[arr.length - 2];
        
    }
}