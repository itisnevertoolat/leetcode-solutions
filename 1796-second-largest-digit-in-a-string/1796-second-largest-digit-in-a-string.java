class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        String test = s.replaceAll("[a-z]", " ");
        for(char c: test.toCharArray()){
            if(c-'0' == -16)
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