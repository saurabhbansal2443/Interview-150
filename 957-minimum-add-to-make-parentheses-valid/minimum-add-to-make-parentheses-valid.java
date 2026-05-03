class Solution {
    public int minAddToMakeValid(String s) {

        if(s.length() == 0 ){
            return 0 ; 
        }else {
            Stack<Character> st = new Stack<>(); 

            int count = 0 ; 

            for(int i=0 ; i<s.length();i++){
                char ch = s.charAt(i); 

                if(ch == '('){
                    st.push(ch); 
                }else{

                    if(st.size()>0 && st.peek() == '('){
                        st.pop(); 
                    }else{
                        count++; 
                    }
                }
            }

            return count + st.size(); 

        }
        
    }
}