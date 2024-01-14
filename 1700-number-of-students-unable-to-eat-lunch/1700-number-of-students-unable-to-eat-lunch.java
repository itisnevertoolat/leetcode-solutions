class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i: students)
            queue.add(i);
        int res = 0;
        int i = 0;
        while(queue.size() != res){
            int x = queue.remove();
            if(x == sandwiches[i]){
                res = 0;
                i++;
            }else{
                res++;
                queue.add(x);
            }
        }
        return queue.size();
    }
}