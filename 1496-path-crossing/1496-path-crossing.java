class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Map<List<Integer>, Integer>  map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        map.put(list, 1);
        for(char c: path.toCharArray()){
            list = new ArrayList<>();
            if(c == 'N')
                x++;
            else if(c == 'S')
                x--;
            else if(c == 'E')
                y++;
            else
                y--;
            list.add(x);
            list.add(y);
            int res = map.getOrDefault(list, 0) +1;
            if(res == 2)
                return true;
            map.put(list, res);
            
        }
        return false;
    }
}  