class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length ; 

        int[] left = new int[n]; 
        left[0] = 1 ; 

        for(int i=1 ; i<n ; i++ ){
            if( ratings[i-1] < ratings[i]){
                left[i] = left[i-1]+1; 
            }else{
                left[i] = 1 ; 
            }
        }

        int[] right = new int[n]; 
        right[n-1] = 1 ; 

        for(int i = n-2 ; i>=0 ; i-- ){
            if( ratings[i+1] < ratings[i]){
                right[i] = right[i+1]+1; 
            }else{
                right[i] = 1 ; 
            } 
        }
        int sum = 0 ; 

        for(int i=0;i<n;i++){
            sum += Math.max(left[i] , right[i]); 
        }

        return sum ; 
    }

    // in this case we have taken a left and right array in the left considering onoy the 
    // left neighour is only there and similarly the right array and then taken the 
    // maximum value out of it and adding that because that will statisfy the both the 
    //condition 
}