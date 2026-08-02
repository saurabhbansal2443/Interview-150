class Solution {
    public String reverseWords(String s) {
        s = s.trim(); 
        String[] arr = s.split("\\s+"); 


        StringBuilder sb = new StringBuilder(); 

        sb.append(arr[arr.length-1]); 

        for(int i=arr.length-2 ; i>=0 ; i--){
            sb.append(" " + arr[i]);
        }
        return sb.toString(); 
    }
}