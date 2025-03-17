class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C' ,100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0 ; 

        for(int i=0 ; i<s.length()-1; i++){
            char curr = s.charAt(i); 
            char next = s.charAt(i+1); 

            int currValue = hm.get(curr); 
            int nextValue = hm.get(next); 

            if(nextValue > currValue ){
                sum -= currValue ; 
            }else{
                sum+=currValue ; 
            }
        }

        sum+=hm.get(s.charAt(s.length()-1)); 

        return sum ; 
    }

    // in this question we have firstly taken all the value of roman number into map 
    // then the value of the caharcter is selected according to charcter whoch is next to
    // it if that is greater than currentValue we have to take that value as negative value 
    // for example IV the I value depend on V as V is greater than I that's why we have 
    // taken as -1 and similary it goes for every charcter but the last character will 
    //always a positive as e dont have next character then adding all the values and 
    //returning the sum  
}