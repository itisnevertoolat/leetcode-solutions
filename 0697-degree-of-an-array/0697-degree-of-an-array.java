class Solution {
    public int findShortestSubArray(int[] A) {
            Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
            int res = 0, degree = 0;
            for (int i = 0; i < A.length; ++i) {
                first.putIfAbsent(A[i], i);
                count.put(A[i], count.getOrDefault(A[i], 0) + 1);
                if (count.get(A[i]) > degree) {
                    degree = count.get(A[i]);
                    res = i - first.get(A[i]) + 1;
                } else if (count.get(A[i]) == degree)
                    res = Math.min(res, i - first.get(A[i]) + 1);
            }
            return res;
        }
}


// class Solution {
//     public int findShortestSubArray(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         List<Integer> list = new ArrayList<>();
//         int max = Integer.MIN_VALUE;
//         for(int i: nums){
//             int x = map.getOrDefault(i, 0) + 1;
//             map.put(i, x);
//             if(x > max)
//                 max = x;
            
//         }
//         for(int i: map.keySet()){
//             if(map.get(i) == max)
//                 list.add(i);
//         }
//         int min = Integer.MAX_VALUE;
//         for(int num: list){
//             int start = 0;
//             int end = 0;
//             for(int i=0;i<nums.length;i++){
//                 if(nums[i] == num){
//                     start = i;
//                     break;
//                 }

//             }
//             for(int i=nums.length - 1;i > 0;i--){
//                 if(nums[i] == num){
//                     end = i;
//                     break;
//                 }

//             }
//             min = Math.min(end - start, min);
            
//         }

//         return min +  1;
        
        
//     }
// }