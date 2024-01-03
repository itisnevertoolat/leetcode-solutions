class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for(String s: bank){
            int count = 0;
            for(char c: s.toCharArray()){
                if(c == '1')
                    count++;
                
            }
            if(count > 0)
                list.add(count);
        }
        int res = 0;
        for(int i=1;i<list.size();i++){
            res += list.get(i-1) * list.get(i);
        }
        return res;
    }
}