class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0 ; 
        String maxStr = ""; 

        for(int i=0 ; i<s.length(); i++){
            for(int j=i+1 ; j<=s.length(); j++){
             String str = s.substring(i,j); 
               if(checkPlaindrome(str)){
                 if(maxLength < str.length()){
                    maxLength = str.length(); 
                    maxStr = str ; 
                 }
               }
            }
        }
        return maxStr; 
    }
    public boolean checkPlaindrome(String str){
        int start =0 ; 
        int end = str.length()-1; 
        while(start<end ){
            if(str.charAt(start) != str.charAt(end)){
                return false ; 
            }
            start++; 
            end-- ; 
        }
        return true ; 
    }
}