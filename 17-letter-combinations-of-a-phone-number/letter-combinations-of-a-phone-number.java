class Solution {
    public List<String> letterCombinations(String digits) {
        
        String[] map = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"} ;
        
        return helper(digits , map )  ; 
    }

    public static List<String> helper(String digits, String[] map) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 1) {
            int idx = digits.charAt(0) - '0';
            String str = map[idx];
            for (int i = 0; i < str.length(); i++) {
                ans.add(str.charAt(i)+"");
            }
            return ans;
        }

        List<String> pans = helper(digits.substring(1), map);

        char ch = digits.charAt(0);
        int idx = ch - '0';
        String str = map[idx];

        for (int i = 0; i < str.length(); i++) {
            char chi = str.charAt(i); 
            for (String p : pans) {
                ans.add(chi + p ); 
            }
        }

        return ans ; 

    }

}