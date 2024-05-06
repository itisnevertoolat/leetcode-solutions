class Solution {
   public int minAnagramLength(String s) {
       int len = s.length();
       List<Integer> list = new ArrayList<>();
       for (int i = 1; i <= Math.sqrt(len); i++) {
           if (len % i == 0) {// all possible answers
               int k = len / i;
               if (k != i) {
                   list.add(i);
                   list.add(k);
               } else {
                   list.add(i);
               }
           }
       }
       Collections.sort(list);

       for (int i = 0; i < list.size(); i++) {
           int ans = list.get(i);
           Map<Character, Integer> mp1 = new HashMap<>();
           for (int j = 0; j < ans; j++)
               mp1.put(s.charAt(j), mp1.getOrDefault(s.charAt(j), 0) + 1);
           boolean found = true;
           for (int j = ans; j < len; j += ans) {
               Map<Character, Integer> mp2 = new HashMap<>();
               for (int k = j; k < j + ans; k++) {
                   mp2.put(s.charAt(k), mp2.getOrDefault(s.charAt(k), 0) + 1);
               }
               if (!mp1.equals(mp2)) {
                   found = false;
                   break;
               }
           }

           if (found) return ans;
       }
       return len;
   }

}