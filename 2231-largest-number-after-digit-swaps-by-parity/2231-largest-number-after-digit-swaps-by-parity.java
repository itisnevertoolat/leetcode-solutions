class Solution {
    public int largestInteger(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        PriorityQueue<Character> evenQueue = new PriorityQueue<>();
        PriorityQueue<Character> oddQueue = new PriorityQueue<>();
        StringBuilder res = new StringBuilder();
        for(char c: arr){
            if(c % 2 == 0){
                evenQueue.add(c);
            }else{
                oddQueue.add(c);

            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] % 2 == 0 ? evenQueue.poll() : oddQueue.poll();
        }

        return Integer.parseInt(new String(arr));
    }
}