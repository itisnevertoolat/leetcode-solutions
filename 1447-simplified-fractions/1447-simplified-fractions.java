class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        Set<Double> set = new HashSet<>();
        for(int i=1;i<n;i++){
            for(int j=2;j<=n;j++){
                double x = (double)i / j;
                if(!set.contains(x) && x > 0 && x < 1){
                    set.add(x);
                    res.add(i+"/"+j);
                }
                    
            }
            
        }
        return res;
    }
}