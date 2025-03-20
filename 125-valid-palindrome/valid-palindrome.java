class Solution {
    public boolean isPalindrome(String s) {
        if (s==" ") return true;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a>='a' && a<='z'){
                sb.append(a);
            }else if(a>='A' && a<='Z'){
                char b=Character.toLowerCase(a);
                sb.append(b);
            }else if(a>='0' && a<='9'){
                 sb.append(a);
            }
            
        
        }
        
        String s1=sb.toString();
        String s2=(sb.reverse()).toString();
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}