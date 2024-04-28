// class Solution {
//     public int passThePillow(int n, int time) {
//         if(time > n)
//             return (time % n) + 1;
//         else if(time < n)
//             return (1 + time) % n ;
//         return 2;
            
        
//     }
// }

class Solution {
    public int passThePillow(int n, int t) {
        int rounds = t/(n-1); // how many rounds have we passed back and forth
        int k = t % (n-1); // index starting from left or right at the last round
        return rounds % 2 == 0 ? k+1 : n - k;
    }
}