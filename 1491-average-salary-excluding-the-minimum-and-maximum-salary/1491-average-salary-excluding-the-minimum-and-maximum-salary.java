class Solution {
    public double average(int[] salary) {
        final DecimalFormat df = new DecimalFormat("0.00000");
        double res=0.0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            res += salary[i];
            
        }
        return Double.valueOf(df.format(res/(salary.length-2)));
        
    }
}