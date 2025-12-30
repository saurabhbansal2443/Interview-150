class Solution {
    public boolean isPalindrome(String str) {
        str = str.trim(); 
        if(str.length() ==0 || str.length() ==1){
            return true  ; 
        } 

        String formatted = formatString(str); 
        return checkPlaindrome(formatted); 

    }

    public String formatString(String str){
     
        if(str.length() ==0 || str.length() ==1){
            return str ; 
        }
        StringBuilder sb = new StringBuilder(); 

        for(int i=0 ; i<str.length();i++){
            char ch = str.charAt(i); 

            if(ch>='A' && ch<='Z'){
                sb.append((char)(ch-'A'+'a')); 
            }else if (ch>='a' && ch<='z'){
                sb.append(ch); 
            }else if(ch>='0' && ch<='9'){
                 sb.append(ch);
            }
        }
        return sb.toString(); 
    }

    public boolean checkPlaindrome(String str){
        int start = 0 ; 
        int end = str.length()-1; 

        while(start<end){
            char chEnd = str.charAt(end); 
            char chSt = str.charAt(start); 

            if(chEnd != chSt){
                return false; 
            }
            start++; 
            end--; 
        }
        return true ; 
    }

}