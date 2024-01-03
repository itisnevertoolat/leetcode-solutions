class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for(String s: bank){
            int count = 0;
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sb = new String(arr);
            int idx = sb.lastIndexOf('0');
            count = s.length() - (idx  +1);
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