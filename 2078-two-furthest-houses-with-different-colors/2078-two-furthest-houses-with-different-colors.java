class Solution {
    public int maxDistance(int[] colors) {
        int res = 0;
        int left= 0, right = colors.length - 1;
        while(left < right){
            if(colors[right] != colors[left]){
                res= right - left;
                break;
            }
            else
                right--;
        }
        left= 0; right = colors.length - 1;
        while(left < right){
            if(colors[right] != colors[left]){
                return Math.max(res, right - left);
            }
            else
                left++;
        }
        return res;
    }
}