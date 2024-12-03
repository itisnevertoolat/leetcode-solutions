class Solution {
    public int distMoney(int money, int children) {
        if(money < children)
            return -1;
        if(money > children * 8) return children - 1;
        int res = 0;
        while(money >  0 && money -8 >= children - 1){
            res++;
            money -=8;
            children--;
                
        }
        if(money == 4 && children == 1)
            return --res;
        return res;
    }
}
