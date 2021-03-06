package Arrays;

public class mergetwoarrays {

    /**
     *  Problem link:-   https://leetcode.com/problems/merge-sorted-array/
     */
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i  = m -1;int j = n-1;int k  = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else
            {
                nums1[k--] = nums2[j--];
            }
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
    
}
