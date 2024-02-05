class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copied = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copied);
        for(int x: copied)
            map.putIfAbsent(x, map.size() + 1);
        for(int i=0;i< arr.length;i++)
            copied[i] = map.get(arr[i]);

        return copied;
        
    }
}