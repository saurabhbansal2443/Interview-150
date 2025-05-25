class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = nums1.length - 1;

        while (p3 >= 0) {
            int num1 = p1>=0 ? nums1[p1] : Integer.MIN_VALUE ; 
            int num2 = p2>=0 ? nums2[p2] : Integer.MIN_VALUE ; 

            if (num1 > num2) {
                nums1[p3] = num1 ;
                p1--;
            } else {
                nums1[p3] = num2 ;
                p2--;
            }
            p3--; 
        }

    }
}