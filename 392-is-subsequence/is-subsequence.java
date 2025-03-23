class Solution {
    public boolean isSubsequence(String s, String t) {
       
       if(s.length()==0) return true ; 
      

        int in = 0;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            char th = s.charAt(in);

            if (ch == th) {
                in++;
                if (in == s.length()) {
                    return true;
                }
            }

        }

        if (in == s.length() ) {
            return true;
        }

        return false;
    }
}