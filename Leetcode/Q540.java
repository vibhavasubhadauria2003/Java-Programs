class Solution {
    public int singleNonDuplicate(int[] nums) {
        int f=0,l=nums.length-1,mid=f;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[f]!=nums[f+1]){
            return nums[f];
        }
        if(nums[l]!=nums[l-1]){
            return nums[l];
        }
        f++;
        l--;
        while(f<=l){
            mid=(f+l)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                break;
            }
            else if(nums[mid]==nums[mid-1]){
                if(mid%2==0){
                    l=mid-2;
                }
                else{
                    f=mid+1;
                }
            }
            else{
                if(mid%2==0){
                    f=mid+2;
                }
                else{
                    l=mid-1;
                }
            }
        }
        return nums[mid];
    }
}

public class Q540 {
    
}
