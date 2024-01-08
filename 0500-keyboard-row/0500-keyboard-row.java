class Solution {
    public String[] findWords(String[] words) {
        String a="qwertyuiopQWERTYUIOP";
        String b="asdfghjklASDFGHJKL";
        String c="zxcvbnmZXCVBNM";
        List<String> l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int p=0,q=0,r=0;
            for(int j=0;j<words[i].length();j++){
                if(a.indexOf(words[i].charAt(j))!=-1){
                    p++;
                }
                else if(b.indexOf(words[i].charAt(j))!=-1){
                    q++;
                }
                else{
                    r++;
                }
            }
            if((p==0 && q==0) || (q==0 && r==0) || (p==0 && r==0)){
                l.add(words[i]);
            }
        }
        String arr[]=new String[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}