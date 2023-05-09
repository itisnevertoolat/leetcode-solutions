class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> evenQueue = new PriorityQueue<>();
        PriorityQueue<Integer> oddQueue = new PriorityQueue<>();
        int temp = num;
        StringBuilder res = new StringBuilder();
        while(num > 0){
            int current = num % 10;
            if(current % 2 == 0){
                evenQueue.add(current);
            }else{
                oddQueue.add(current);

            }
            num /= 10;
        }
        num = temp;
        while(num > 0){
            int current = num % 10;
            if(current%2==0) res.insert(0, evenQueue.poll());
            else res.insert(0, oddQueue.poll());
            System.out.println(res);
            num /= 10;
        }
      

        return Integer.valueOf(res.toString());
    }
}