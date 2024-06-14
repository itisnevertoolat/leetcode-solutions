class Solution {
    
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int res = 0, need = 0;
        for (int a : A) {
            res += Math.max(need - a, 0);
            need = Math.max(a, need) + 1;
        }
        return res;
    }
//     public int minIncrementForUnique(int[] nums) {
//         List<Integer> list = new ArrayList<>();
//         Set<Integer> set = new HashSet<>();
//         for(int i: nums){
//             if(set.contains(i))
//                 list.add(i);
//             else
//                 set.add(i);
//         }
//         int res = 0;
        
//         for(int i: list){
//             while(set.contains(i)){
//                 i++;
//                 res++;
//             }
//             set.add(i);
//         }
//         return res;
        
//     }
}