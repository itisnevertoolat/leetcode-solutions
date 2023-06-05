// class Solution {
//     int matches = 0;
//     int teams = 0;
//     public int numberOfMatches(int n) {
//         if (n == 1){
//             return matches;
//         }
//         if(n % 2 ==0){
//             teams = n / 2;
//             matches += n / 2;
//         }
            
//         else{
//             teams = (n - 1) / 2 + 1;
//             matches += (n - 1) / 2;
//             }
        
//         numberOfMatches(teams);
//         return matches;
//     }
// }


//another easy beasy solution
class Solution {
    public int numberOfMatches(int n) {
        return n-1;
    }
}