class Solution {
    PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) ->{
        int diff = Integer.compare(a[0], b[0]);
        if(diff != 0)
            return diff;
        return Integer.compare(b[1], a[1]);
    });
    public String clearStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                sb.setCharAt(i, '.');
                int idxOfSmallest = (pq.poll())[1];
                sb.setCharAt(idxOfSmallest, '.');
            }else
                pq.add(new int[]{s.charAt(i), i});
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++)
            if(sb.charAt(i) != '.')
                res.append(sb.charAt(i));
        
        return res.toString();
        
    }
}