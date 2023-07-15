class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sumfirst=0, sumsecond=0, sumtarget=0;
        for(char c : firstWord.toCharArray()){
            sumfirst += c-'a';
            sumfirst *= 10;
        }
        for(char c : secondWord.toCharArray()){
            sumsecond += c-'a';
            sumsecond *= 10;
        }
        for(char c : targetWord.toCharArray()){
            sumtarget += c-'a';
            sumtarget *= 10;
        }
       
        return (sumfirst + sumsecond) == sumtarget;
    }
}



// class Solution {
//     public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
//         StringBuilder fN = new StringBuilder();
//         StringBuilder sN = new StringBuilder();
//         StringBuilder tN = new StringBuilder();
//         for(int i=0;i<firstWord.length();i++){
//             fN.append(Math.abs(firstWord.charAt(i) - 'a'));
//         }
//         for(int i=0;i<secondWord.length();i++){
//             sN.append(Math.abs(secondWord.charAt(i) - 'a'));
//         }
//         for(int i=0;i<targetWord.length();i++){
//             tN.append(Math.abs(targetWord.charAt(i) - 'a'));
//         }
//         return (Integer.parseInt(fN.toString())+Integer.parseInt(sN.toString()) == Integer.parseInt(tN.toString()));
        
//     }
// }