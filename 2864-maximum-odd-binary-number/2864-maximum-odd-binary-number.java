class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '1'){
                count++;
                arr[i] = '0';
            }
                
        }
        
        int idx = 0;
        for(int i=0;i<count;){
            if(--count > 0)
                arr[idx++] = '1';
        }
        arr[arr.length-1] = '1';
            return new String(arr);
        
    }
}