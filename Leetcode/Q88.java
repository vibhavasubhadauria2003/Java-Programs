
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums3[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                nums3[k++]=nums1[i++];
            }
            else{
                nums3[k++]=nums2[j++];
            }
        }
        if(i==m){
            while(j<n){
                nums3[k++]=nums2[j++];
            }
        }
        else{
            while(i<m){
                nums3[k++]=nums1[i++];
            }
        }
        for(int l=0;l<(m+n);l++){
            nums1[l]=nums3[l];
        }
    }
}

public class Q88 {
    
}
