class Solution {
    public int trap(int[] height) {
        int n = height.length ; 
        int[] right = new int[n]; 
        right[n-1] = height[n-1]; 

        for(int i=n-2 ; i>=0 ; i-- ){
            right[i] = Math.max(right[i+1] , height[i+1]) ;
        }

        int sum = 0 ; 
        int leftMax = height[0]; 

        for(int i=1 ; i<n; i++ ){
           int water =   Math.min(Math.max(leftMax , height[i-1]), right[i]) - height[i]; 

           if( water > 0 ) sum+= water ; 

            leftMax = Math.max(leftMax, height[i]);
        }

        return sum ; 
    }

    // in this question we have taken a approach finding the leftmax array and rightMax
    // array which contains the value of the maximum value at the left before that value 
    // same for right max and then taking the minimum out of it as water can be stored till 
    // the minimum wall and deleting the height of the current building and adding that 
}