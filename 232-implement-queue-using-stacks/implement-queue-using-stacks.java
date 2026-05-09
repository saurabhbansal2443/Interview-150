class MyQueue {

    Stack<Integer> main ; 
    Stack<Integer> helper ; 

    public MyQueue() {
        main = new Stack<>(); 
        helper = new Stack<>(); 
    }
    
    public void push(int x) {
        if(main.size() == 0 ){
            this.main.push(x); 
            return ; 
        } 
        while(main.size()>0){
            helper.push(main.pop()); 
        }
        this.main.push(x); 

          while(helper.size()>0){
            main.push(helper.pop()); 
        }
    }
    
    public int pop() {
        return this.main.pop(); 
    }
    
    public int peek() {
       return this.main.peek();   
    }
    
    public boolean empty() {
        return this.main.size() == 0 ? true : false ; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */