class Solution {
    public int[] minOperations(String boxes) {
        System.out.print(boxes.length());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i) == '1')
                list.add(i);
        }
        int[] res = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int steps = 0;
            for(int j: list)
                steps += Math.abs(i-j);
            res[i] = steps;
        }
        return res;
    }
}