class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i =1;i<=n;i++){
            int x = sum(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
            max = Math.max(max, map.get(x));
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == max)
                res++;
        }
        return res;
        
    }
    public int sum(int x){
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x = x /10;
        }
        return sum;
    }
}