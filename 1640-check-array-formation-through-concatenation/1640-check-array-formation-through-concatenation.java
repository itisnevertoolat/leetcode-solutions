class Solution {
   public boolean canFormArray(int[] arr, int[][] pieces) {
        if (arr.length == 0)
            return true;
        Map<Integer, Integer> map = new HashMap<>(); // value to index in arr.
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int[] p : pieces) {
            if (!map.containsKey(p[0])) return false;
            int index = map.get(p[0]);
            for (int i = 1; i < p.length; i++) { // if current piece's length > 1, we do further check.
                if (!map.containsKey(p[i]) || map.get(p[i]) != ++index) return false;
            }
        }
        return true;
    }
}