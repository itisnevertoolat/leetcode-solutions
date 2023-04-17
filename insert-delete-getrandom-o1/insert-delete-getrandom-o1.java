class RandomizedSet {

    Map<Integer, Integer> map;
    List<Integer> list;
    Random random = new Random();
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int idx = map.get(val);
            int lastIndex = list.size()-1;
            if(idx < lastIndex){
                list.set(idx,list.get(lastIndex));
                map.put(list.get(idx), idx);
            }
            
            list.remove(lastIndex);
            map.remove(val);
            return true;
        }else{
            return false;
        }
        
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */