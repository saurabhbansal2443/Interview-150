class RandomizedSet {
    ArrayList<Integer> arr ; 
    HashMap<Integer,Integer> map ; 
    public RandomizedSet() {
        arr = new ArrayList<>(); 
        map = new HashMap<>(); 
    }
    
    public boolean insert(int val) {
        boolean containsValue = map.containsKey(val); 

        if( containsValue == true  ) return false ; 

        arr.add(val); 

        map.put(val , arr.size()-1 ); 

        return true ; 
    }
    
    public boolean remove(int val) {
         boolean containsValue = map.containsKey(val); 
           if( containsValue == false ) return false ; 

           int valIndex = map.get(val); 
           int lastValue =  arr.get(arr.size()-1);
           arr.set(valIndex , lastValue ); 
           map.put(lastValue  , valIndex); 
           arr.remove(arr.size()-1);
           map.remove(val);

           return true ; 

    }
    
    public int getRandom() {
          if (arr.isEmpty()) throw new IllegalStateException("Set is empty");
            int randomNumber = (int) ((Math.random() * arr.size()));

            return arr.get(randomNumber); 
    }
}

// In this code we have used a ArrayList and a hashmap to make this new datastructure  in which insert and delete is of complexity 0(1), 
//insert is easy if element is present donot add that if it is not add to array and store in map ( val , index ), we are storing this so that we know where is element and this will help us to remove this easily in o(1); 
// delete - in delete first check element is present or not if present then get the index of that element and then put the last element of array at its position, and also chnage the index of the last element in map and then remove the last element 