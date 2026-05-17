class MedianFinder {
 private PriorityQueue<Integer> min ; 
 private PriorityQueue<Integer> max ; 
    public MedianFinder() {
       min = new PriorityQueue<>(); 
       max = new PriorityQueue<>(Collections.reverseOrder()); 
    }
    
    public void addNum(int num) {
        if(this.min.size() == 0 ){
            this.max.add(num); 
        }else if (this.min.peek() < num ){
            this.min.add(num); 
        }else{
            this.max.add(num); 
        }

        if(this.min.size() - this.max.size() > 1){
            this.max.add(this.min.remove()); 

        }else  if(this.max.size() - this.min.size() > 1){
            this.min.add(this.max.remove()); 
        }
        
    }
    
    public double findMedian() {
        if(this.min.size() == this.max.size()){
            return (double)(this.min.peek() + this.max.peek())/2; 
        }else if (this.min.size() > this.max.size()){
            return (double)this.min.peek(); 
        }else{
             return (double)this.max.peek();  
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */