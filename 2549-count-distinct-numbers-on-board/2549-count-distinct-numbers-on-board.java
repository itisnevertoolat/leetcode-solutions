class Solution {
    public int distinctIntegers(int n) {
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        set.add(n);
        queue.add(n);
        while(!queue.isEmpty()){
            int num = queue.remove();
            for(int i=1;i<num;i++){
                if(num % i == 1){
                    set.add(i);
                    queue.add(i);
                }
            }
        }
        return set.size();
    }
}