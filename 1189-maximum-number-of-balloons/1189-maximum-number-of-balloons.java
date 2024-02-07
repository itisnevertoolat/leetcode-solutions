class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for(char c: text.toCharArray())
            if(map.containsKey(c))
                map.put(c, map.getOrDefault(c, 0)+1);
        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);
        int x = map.values().stream().sorted().toList().get(0);
        if(x == 0)
            return 0;
        else
            return x;
    }
}