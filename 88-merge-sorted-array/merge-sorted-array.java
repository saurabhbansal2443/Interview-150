class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0 ) return ; 
        if (m==0 ){
            for( int i= 0 ; i<n;i++){
                nums1[i] = nums2[i];
            }
            return ; 
        }

        int p1 = m-1 ; 
        int p2 = n-1 ; 
        int p3 = m+n-1 ; 

        while( p1 >=0 || p2>=0){
            int val1 = p1>=0 ? nums1[p1] : Integer.MIN_VALUE ; 
            int val2 = p2>=0 ? nums2[p2] : Integer.MIN_VALUE ; 

            if( val1 > val2 ){
                nums1[p3] = val1 ; 
                p1-- ; 
            }else{
                nums1[p3] = val2 ; 
                p2-- ; 
            }
            p3--; 
        }
        

    }
}

// The question is 2 merge 2 sorted array but the catch is we have to merge both the array in first array, so we have started traversing both the array from last and taken 3 pointer p1, p2 , p3 and then started filling the nums1 array from last to avoid using extra spaces becuase in last the extra spaces are empty 