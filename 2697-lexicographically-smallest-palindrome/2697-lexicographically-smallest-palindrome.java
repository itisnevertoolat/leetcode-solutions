class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] palindrome = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(palindrome[left] > palindrome[right]){
                palindrome[left] = palindrome[right];
            }else if(palindrome[left] < palindrome[right])  palindrome[right] = palindrome[left];
            left++;
            right--;
            
        }
        return new String(palindrome);
    }
}