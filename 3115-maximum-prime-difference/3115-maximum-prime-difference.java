class Solution {
    public int maximumPrimeDifference(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(checkPrime(nums[i]) && nums[i] != 1)
                list.add(i);
        }
        return list.get(list.size()-1) - list.get(0);
        
    }
    public boolean checkPrime(int x){
        for(int i=2;i<x;i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }
}