class Solution {
    public int[] circularGameLosers(int n, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        int num = (1+k) % n;
        int turnCount = 2;
        while(true){
            if(num == 0)
                num = n;
            int x = map.getOrDefault(num, 0) + 1;
            if(x == 2)
                break;
            map.put(num, x);
            num = (num + turnCount++ * k)  % n;
            
        }
        int count = 0;
        int[] res = new int[n - map.size()];
        for(int i=1;i<= n;i++){
            if(!map.containsKey(i))
                res[count++] = i;
        }
        return res;
    }
}