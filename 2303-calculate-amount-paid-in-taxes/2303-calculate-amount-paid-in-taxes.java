import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {
    public double calculateTax(int[][] arr, int count) {
        int prev = 0;
        
        for(int[] num: arr){
            int y = num[0] - prev;
            int x = count - (y);
            prev = num[0];
              if(x > 0){
                  num[0] = y;
                  count -= num[0];
              }else if(count > 0){
                  num[0] = count;
                  count -= num[0];
              }

              else
                  num[0] = 0;

              
          }
        double res = arr[0][0] * (arr[0][1]/100.0);
        for(int i=1;i<arr.length;i++){
            res += arr[i][0] * (arr[i][1]/100.0);
        }
        // for(int[] num: arr){
        //     System.out.println(num[0]);
        // }
        return res;
    }
}