class Solution {
    public String[] findWords(String[] words) {
        String[] arr = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new ArrayList<>();
        int count = 0;
        for(String s: words){
                char c = s.toLowerCase().charAt(0);
                boolean contain = true;
                if(arr[0].contains(c+"")){
                    for(int i=1;i<s.length();i++){
                        c = s.toLowerCase().charAt(i);
                        if(arr[0].contains(c+""))
                            continue;
                        else{
                            contain = false;
                            break;
                            
                        }
                            
                }
            }
                else if(arr[1].contains(c+"")){
                    for(int i=1;i<s.length();i++){
                        c = s.toLowerCase().charAt(i);
                        if(arr[1].contains(c+""))
                            continue;
                        else{
                            contain = false;
                            break;
                            
                        }
                }
            }
            else if(arr[2].contains(c+"")){
                    for(int i=1;i<s.length();i++){
                        c = s.toLowerCase().charAt(i);
                        if(arr[2].contains(c+""))
                            continue;
                        else{
                            contain = false;
                            break;
                            
                        }
                }
            }
    if(contain)
        list.add(s);
        }
        String[] res = new String[list.size()];
        for(int i=0;i<list.size();i++)
            res[i] = list.get(i);
        return res;
        
    }
}