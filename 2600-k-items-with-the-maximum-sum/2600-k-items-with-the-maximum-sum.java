class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int total = 0;
        
        int select=Math.min(numOnes,k);       
		total+=select;                        
        k-=select;                                  
        
        select=Math.min(numZeros,k);          
        k-=select;                                 
        
        select=Math.min(numNegOnes,k);  
        total-=select;    
        
        return total;
//         while(k > 0){
//             if(k > numOnes && numOnes != 0){
//                 k -= numOnes;
//                 res += numOnes;
//                 numOnes = 0;
//             }
//             else if(numOnes >= k)
//                 return k;
//             else if(k > numZeros && numZeros != 0){
//                 k -= numZeros;
//                 numZeros = 0;
//             }
//             else if(numZeros >= k)
//                 return res;
//             else if(k > numNegOnes && numNegOnes != 0 ){
//                 k -= numNegOnes;
//                 numNegOnes = 0;
//                 res -= numNegOnes;
//             }
//             else if(numNegOnes >= k)
//                 return res -= k;
            
//         }
        // return res;
    }
}