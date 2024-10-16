package src;

import java.util.Arrays;

public class merge_sorted_array {
   
    public static void main(String[] args) {
       int[] nums1 ={1,2,3,4,0,0,0,0};
       int[] nums2 = {2,3,7,8};  
       merge(nums1,nums1.length, nums2, nums2.length);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while (i < m) {
            mix[k] = nums1[i];
            i++;
            k++;
        }
        
        while (j < n) {
            mix[k] = nums2[j];
            j++;
            k++;
        }
        
        // Copy elements from mix back to nums1
        for (int l = 0; l < m + n; l++) {
            nums1[l] = mix[l];
        }
        
        System.out.println(Arrays.toString(nums1));
    }
    
}
