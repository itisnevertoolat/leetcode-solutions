class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i] == 0)
                continue;
            for(int j=0;j<digits.length;j++){
                if(i==j)
                    continue;
                for(int k=0;k<digits.length;k++){
                    if(k==j || k == i)
                        continue;
                    int x = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(x % 2 == 0)
                        set.add(x);
                }
            }
        }
        int[] res = new int[set.size()];
        int count = 0;
        for(int i: set)
            res[count++] = i;
        Arrays.sort(res);
        return res;
    }
}