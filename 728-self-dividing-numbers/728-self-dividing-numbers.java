class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(helper(i)) res.add(i);
        }
        return res;
    }
    public boolean helper(int i){
        int curr =i;
        while(i > 0){
            if(i %10 == 0 || curr % (i %10) != 0) return false;
            i /= 10;
        }
        return true;
    }
}