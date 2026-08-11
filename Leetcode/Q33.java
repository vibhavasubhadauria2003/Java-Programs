class Solution {
    public int search(int[] nums, int target) {
        int f=0,l=nums.length-1,mid;
        while(f<=l){
            mid=(f+l)/2;
            System.out.println(f+" "+mid+" "+l);
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[f]<=nums[mid]){
                if(target>=nums[f]&&target<=nums[mid]){
                    l=mid-1;
                }
                else{
                    f=mid+1;
                }
            }
            else{
                if(target>=nums[mid]&&target<=nums[l]){
                    f=mid+1;
                }
                else{
                    l=mid-1;
                }
            }
        }
        return -1;
    }
}
public class Q33 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int nums[]={5,1,3};
        int c=o1.search(nums, 3);
        System.out.println(c);
    }
}
