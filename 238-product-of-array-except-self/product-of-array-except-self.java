class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;

        int zeroCount = 0;

        if (nums[0] == 0)
            zeroCount++;

        int[] start = new int[n];

        start[0] = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i]==0)
                zeroCount++;
            start[i] = start[i - 1] * (nums[i - 1] != 0 ? nums[i - 1] : 1);
        }

        int[] end = new int[n];

        end[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            end[i] = end[i + 1] * (nums[i + 1] != 0 ? nums[i + 1] : 1);
        }

        int[] ans = new int[n]; 

        for(int i=0 ; i<n;i++){
            if(zeroCount > 1){
                ans[i] = 0 ; 
            }else if ( zeroCount ==1  && nums[i] == 0 ){
             ans[i] = start[i] * end[i]; 
            }else if (zeroCount ==1 ){
                ans[i] = 0 ; 
            }else{
                ans[i] = start[i] * end[i]; 
            }
        }

        return ans ; 

    }
}