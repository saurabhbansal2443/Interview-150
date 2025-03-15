class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1 || k==0 ) return ; 
        int effectiveRotation =k %  nums.length  ; 

        reverse(nums, 0 , nums.length-effectiveRotation-1); 
        reverse(nums, nums.length-effectiveRotation , nums.length-1); 
        reverse(nums, 0 , nums.length-1); 
        
    }
    public void reverse(int[] arr , int start , int end ){
        if( start >= end ){
            return ; 
        }

        while(start<end ){
            int k = arr[start]; 
            arr[start] = arr[end] ; 
            arr[end] = k ; 
            start++; 
            end--; 
        }


    }
}