
class Solution {
    int findMax(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public int lis(int[] nums,int index,int prev,int dp[][]){
        if(index>=nums.length){
            return 0;
        }
        else{
            if(dp[index][prev+1]!=0){
                return dp[index][prev+1]-1;
            }
            int len1=0+lis(nums,index+1,prev,dp);
            int len2=0;
            if(prev==-1|| nums[index]>nums[prev]){
                len2=1+lis(nums,index+1,index,dp);
            }
            dp[index][prev+1]=findMax(len1,len2)+1;
            return dp[index][prev+1]-1;
        }
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1]; 
        int max=lis(nums,0,-1,dp);
        return max;
    }
}public class Q300 {
    
}
