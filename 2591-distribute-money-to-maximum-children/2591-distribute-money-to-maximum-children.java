class Solution {
    public int distMoney(int money, int children) {
        if(money < children)
            return -1;
        int res = 0;
        while(children > 0 && money >  0){
            if(money - 8 >= 0){
                if(children == 2 && money - 8 == 4)
                    return res;
                if (money -8 < (children - 1) || ((children -1 ) == 0 && (money -8) != 0))
                    return res;
                    
                res++;
                money -= 8;
                children--;
            }else{
                children--;
            }
                
        }
        return res;
    }
}