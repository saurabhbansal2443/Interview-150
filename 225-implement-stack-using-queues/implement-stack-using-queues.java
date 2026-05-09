class MyStack {

    private Queue<Integer> main ; 
    private Queue<Integer> helper ; 

    public MyStack() {
         main = new ArrayDeque<>();
         helper = new ArrayDeque<>();     
    }
    
    public void push(int x) {
        if(this.main.size() == 0 ){
            this.main.add(x); 
            return ; 
        }

        while(this.main.size() > 0 ){
            this.helper.add(this.main.remove()); 
        }
        this.main.add(x) ; 
         while(this.helper.size() > 0 ){
            this.main.add(this.helper.remove()); 
        } 
    }
    
    public int pop() {
        return this.main.remove(); 
    }
    
    public int top() {
        return this.main.peek();  
    }
    
    public boolean empty() {
       return this.main.size() == 0 ? true : false ;  
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */