class RandomizedSet {

    ArrayList<Integer> arr ; 
    HashMap<Integer,Integer> hm ; 

    public RandomizedSet() {
            arr = new ArrayList<>(); 
            hm = new HashMap<>(); 
    }
    
    public boolean insert(int val) {
        
        if(hm.containsKey(val)) return false ; 

        arr.add(val); 
        hm.put(val , arr.size()-1 ); 
        return true ; 
    }
    
    public boolean remove(int val) {
      boolean containsValue = hm.containsKey(val); 
           if( containsValue == false ) return false ; 

           int valIndex = hm.get(val); 
           int lastValue =  arr.get(arr.size()-1);
           arr.set(valIndex , lastValue ); 
           hm.put(lastValue  , valIndex); 
           arr.remove(arr.size()-1);
           hm.remove(val);

           return true ; 
    }
    
   public int getRandom() {
          if (arr.isEmpty()) throw new IllegalStateException("Set is empty");
            int randomNumber = (int) ((Math.random() * arr.size()));

            return arr.get(randomNumber); 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */