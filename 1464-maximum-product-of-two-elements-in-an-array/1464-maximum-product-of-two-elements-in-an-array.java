class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new CustomComparator());
        for(int i = 0;i< nums.length;i++){
            queue.add(nums[i]);
        }
        int a = queue.poll() - 1;
        int b = queue.poll() - 1;
        return a * b;
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
