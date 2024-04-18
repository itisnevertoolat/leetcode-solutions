class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int empBottles = numBottles;
        if(numExchange >  empBottles)
            return res;
        int resEmpBottles = 0;
        while(empBottles + resEmpBottles >= numExchange){
            resEmpBottles++;
            empBottles -= numExchange;
        }
        return res + resEmpBottles;
        
    }
}