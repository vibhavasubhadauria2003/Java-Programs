class Solution {
    public void nextPermutation(int[] nums) {
        int x=nums.length-2;
        while(x>=0){
            if(nums[x]<nums[x+1]){
                break;
            }
            x--;
        }
        if(x>-1){
            for(int i=nums.length-1;i>x;i--){
            if(nums[i]>nums[x]){
                int tem=nums[i];
                nums[i]=nums[x];
                nums[x]=tem;
                break;
            }
        }
        }
        for(int i=x+1;i<=(x+nums.length-1)/2;i++){
            int tem=nums[i];
            nums[i]=nums[nums.length-i+x];
            nums[nums.length-i+x]=tem;
        }
    }
}

public class Q31 {
    
}
