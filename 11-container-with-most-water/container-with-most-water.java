class Solution {
    public int maxArea(int[] height) {
        int ans = 0 ; 
        int start = 0 ; 
        int end = height.length -1 ; 


        while ( start < end ){
            int width = end - start ; 
            int tank = Math.min ( height[start] , height[end]); 
            ans = Math.max( width*tank , ans); 

            if(height[start] < height[end]){
                start++; 
            }else{
                end--; 
            }
        }

        return ans ; 

    }

    // in this question we have taken approch of greedy in this question the array is given the 
    // height of may be container we have to find the maximum water which can be stored between 
    // the walls of container, so there is very simple concept we want two things to be maximize 
    // first is width and height so we are using 2 pointer over here start at 0 and end at last 
    // index and then find the water between these walls as the width is fixed b/w these points 
    // but the height should be taken minimum of them so we have stored that result and comapre 
    // with our maximum and now in order to maximize the water we have to leave the smaller wall 
    // and should contniue with large wall so what ever pointer is on small wall, we will move 
    // that pointer in order of finding the conatiner with most water 
}