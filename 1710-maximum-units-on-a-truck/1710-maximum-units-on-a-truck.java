class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            public int compare(int[] frst, int[] scnd) {
                if(frst[1] <= scnd[1]) {
                    return 1;
                }
                else return -1;
            }
        });
        for(int[] box: boxTypes){
            for(int i=1;i<=box[0];i++){
                if(truckSize - 1 >=0){
                    res += box[1];
                    truckSize--;
                }else break;
            }
        }
        return res;
    }
}