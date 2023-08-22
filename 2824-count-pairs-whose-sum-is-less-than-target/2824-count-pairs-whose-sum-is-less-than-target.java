class Solution {
    
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) < target)
                    res++;
            }
        }
        
        
        return res;
    }
}
// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         Collections.sort(nums);
//         int start = 0;
//         int end = nums.size() -1 ;
//         int res = 0;
//         while(end > start){
//             if(nums.get(start) + nums.get(end) < target){
//                 res += end - start;
//                 start++;
//             }
//             else
//                 end--;
//         }
        
//         return res;
//     }
// }