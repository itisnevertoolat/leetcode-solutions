class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int res = 0, sum =0;
        for (int i : energy) {
            sum += i;
        }
        res += sum - initialEnergy >= 0 ? sum - initialEnergy + 1: 0;
        for(int ex : experience){
            if(initialExperience <= ex){
                res += (ex - initialExperience) + 1;
                initialExperience = ex  + 1;
            }
            initialExperience += ex;
        }
     return res;           
    }
}