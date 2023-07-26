class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        return Arrays.stream(nums).boxed()
            .sorted((a,b) -> map.get(a) !=  map.get(b) ? map.get(a) - map.get(b) : b - a)
            .mapToInt(n -> n)
            .toArray();
        
    }
}