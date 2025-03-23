class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ( n== 0 ){
            return;
        }else if ( m == 0 ){
            for(int i=0; i<nums1.length ; i++ ){
                nums1[i] = nums2[i]; 
            }
            return ; 
        }

        int p1 = m-1 ; 
        int p2 = n-1 ; 
        int p3 = m+n-1 ; 

        while ( p1>= 0 || p2>=0 ){
            int val1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE ; 
            int val2 = p2 >=0  ? nums2[p2] : Integer.MIN_VALUE ; 

            if( val1 > val2 ){
                nums1[p3] = val1 ; 
                p1--; 
            }else{
                 nums1[p3] = val2 ; 
                p2--; 
            }
            p3--;
        }
        return ; 
    }
}