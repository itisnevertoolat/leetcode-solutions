class MyCircularQueue {
    
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        beginningOfQueue=-1;
        topOfQueue=-1;
        size = k;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue] = value;
        }else{
            if(topOfQueue +1 == size){
                topOfQueue = 0;
            }else{
                topOfQueue++;
            }
        }
            arr[topOfQueue] = value;
            return true;
        }
     public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            else if(beginningOfQueue + 1 == size){
                beginningOfQueue = 0;
            }else{
                beginningOfQueue++;
                
            }
            
            return true;
        }
        
        
    }
    
        public int Front() {
            if(isEmpty()){
                return -1;
            }
            return arr[beginningOfQueue];
        }

        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            return arr[topOfQueue];

        }

        public boolean isEmpty() {
            if(topOfQueue == -1){
                return true;
            }
            return false;

        }

        public boolean isFull() {
            if((beginningOfQueue == 0 && topOfQueue==size-1) || (topOfQueue +1 == beginningOfQueue)){
                return true;
            }
            return false;

        }

    
        
    }
    
   

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */