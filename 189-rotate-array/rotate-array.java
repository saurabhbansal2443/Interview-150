class Solution {
    public void rotate(int[] nums, int l) {
        if(nums.length ==1 )return ; 
        int k = l%nums.length ; 
        reverse(nums ,nums.length-k , nums.length-1); 
          reverse(nums ,0 , nums.length-k-1); 
          reverse(nums,0,nums.length-1);

    }

    public void reverse(int[] arr , int start , int end ){
        if(start == end)return ; 

        while(start<end){
            int k = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = k ; 

            start++; 
            end--; 
        }
    }
}