class Solution {
    public boolean isSubsequence(String s, String t) {

        int z = 0;

        for (int i = 0; i < t.length() && z < s.length(); i++) {

            char c1 = s.charAt(z);
            char c2 = t.charAt(i);

            if (c1 == c2) {
                z++;
            }
        }
System.out.print(z); 
        if (z == s.length()) {
            return true;
        }

        return false;

    }
}