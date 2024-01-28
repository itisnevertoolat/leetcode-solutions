class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int numOfPrev = 0;
        for(String s: words){
           
            if(s.equals("prev"))
            {
                numOfPrev++;
                if(nums.size() < numOfPrev)
                    list.add(-1);
                else{
                    list.add(nums.get(nums.size() -numOfPrev ));
                }
            }
            else{
                nums.add(Integer.parseInt(s));
                numOfPrev = 0;
            }
                 
        }
        return list;
    }
}