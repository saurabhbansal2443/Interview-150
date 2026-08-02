class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0]; 
        }

        Arrays.sort(strs); 

        String s1 = strs[0]; 
        String s2 = strs[strs.length-1]; 

        StringBuilder s = new StringBuilder(); 

        int p1 = 0 ; 
        int p2 = 0 ; 

        while(p1<s1.length() && p2<s2.length()){

            char c1 = s1.charAt(p1); 
            char c2 = s2.charAt(p2); 

            if(c1 == c2){
                s.append(c1); 
                p1++; 
                p2++; 
            }else{
            break;
            }
        }

        return s.toString(); 
    }
}