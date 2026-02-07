
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE,currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        
        return maxSum;
    }
}

public class Q53 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int a[]={1,2,-1,-2,2,1,-2,1,4,-5,4};
        int max=o1.maxSubArray(a);
        System.out.println("Final output: "+max);
    }
    
}
