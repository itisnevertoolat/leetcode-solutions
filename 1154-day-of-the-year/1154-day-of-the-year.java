class Solution {
    public int dayOfYear(String date) {
        Map<Integer, Integer> map =  new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        int year = Integer.parseInt(date.substring(0, 4));
        if((year % 4 == 0 && (year % 100 == 0  && year % 400 ==0)) ||
          (year % 4 == 0 && year % 100 != 0) )
            map.put(2, 29);
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int res = day;
        for(int i=1;i<month;i++)
            res += map.get(i);

        return res;
        
        
    }
}