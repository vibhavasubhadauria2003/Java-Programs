//Hard

class Solution {
    double oddevenMedianSortedArrays(int nums1[],int nums2[]){
        int f=0,l=nums1.length-1,mid,total=nums1.length+nums2.length;
        int half=(total%2==0)?(total/2)-1:total/2;
        int leftCut1=0,leftCut2=0,rightCut1=0,rightCut2=0;
        if(nums1.length==0){
            if(nums2.length%2==0){
                return (double)(nums2[(nums2.length-1)/2]+nums2[((nums2.length-1)/2)+1])/2;
            }
            else{
                return nums2[nums2.length/2];
            }
        }
        while (f<=l) {
            mid=f+(l-f)/2;
            //Spliting point of array1
            leftCut1=mid;
            rightCut1=leftCut1+1;
            leftCut2=half-mid-1;
            rightCut2=leftCut2+1;
            if(rightCut1>=nums1.length){
                break;
            }
            if(nums1[leftCut1]<nums2[rightCut2]&&nums2[leftCut2]<nums1[rightCut1]){
                break;
            }
            else if(nums1[leftCut1]>nums2[rightCut2]){
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        double left,right;
        
        if (rightCut1>=nums1.length) {
            if(leftCut2==-1){
                left=nums1[nums1.length-1];
            }
            else{
                left=nums1[nums1.length-1]>nums2[leftCut2]?nums1[nums1.length-1]:nums2[leftCut2];
            }
            
            right=nums2[rightCut2];
          //  System.out.println(nums1[nums1.length-1]+" "+nums2[leftCut2]);
        }
        else if(l==-1){
            left=nums2[leftCut2+1];
            if(rightCut2+1==nums2.length){
                right=nums1[0];
            }
            else{
                right=nums1[0]<nums2[rightCut2+1]?nums1[0]:nums2[rightCut2+1];
            }
            //System.out.println("h");
        }
        else {
            left=nums1[leftCut1]>nums2[leftCut2]?nums1[leftCut1]:nums2[leftCut2];
            right=nums1[rightCut1]<nums2[rightCut2]?nums1[rightCut1]:nums2[rightCut2];
        }
        System.out.println(left+" "+right);
        if(total%2==0){
            return (left+right)/2;
        }
        else{
            return left;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>=nums2.length){
            return oddevenMedianSortedArrays(nums2, nums1);
        }
        else{
            return oddevenMedianSortedArrays(nums1, nums2);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int nums1[]={3};
        int nums2[]={-2,-1};
        double array=o1.findMedianSortedArrays(nums1, nums2);
        System.out.println(array);

    }
}
