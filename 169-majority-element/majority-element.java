class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0]; 
        int count = 1 ; 

        for(int i=1 ; i<nums.length ; i++ ){
            if( ans == nums[i]){
                count +=1 ; 
            }else{
                count -=1 ; 
            }

            if(count == 0 ){
                ans = nums[i]; 
                count =1 ; 
            }
        }

        return ans ; 
    }

    // In this question we have to find a majority element that comes n/2 or 
    // more than this so we have used a approach in which we assumed the first 
    // element to be that majority and incresing when same element we get but 
    // decresing when the diffrent element we get and if the element frequency goes to zero 
    // that means that it is not majority element and we have taken the elemnet at 
    // which the frequency has become zero, as the majority elemnt is at least more than 
    // n/2 time it will cancel other elemnts and becomes the majority one 
}