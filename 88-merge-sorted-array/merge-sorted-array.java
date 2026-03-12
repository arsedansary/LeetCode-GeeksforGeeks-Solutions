class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         //three pointers starting from the end of the arrays
        int maximum = m - 1; //pointer for the last element of nums1
        int minimum = n - 1; //pointer for the last element of nums2
        int result = m + n - 1; //pointer for the merged array (nums1)

        while (minimum >= 0) {
            //if maximum has elements left and is greater put mums1[maximum]
            if (maximum >= 0 && nums1[maximum] > nums2[minimum]) {
                nums1[result] = nums1[maximum];
                maximum--;
            } else { //otherwise, put the element from nums2 into nums1
                nums1[result] = nums2[minimum];
                minimum--;
            }
            result--;
        }        
    }
}