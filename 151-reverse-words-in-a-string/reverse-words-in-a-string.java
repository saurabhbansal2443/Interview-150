class Solution {
    public String reverseWords(String s) {
        
        String str = s.trim(); 

        String[] arr = str.split("\\s+") ; 

        String res = ""; 

        for(int i=arr.length-1 ; i>=0 ; i-- ){
            res = res + " " +  arr[i].trim(); 
        }
        return res.trim() ; 
    }
}