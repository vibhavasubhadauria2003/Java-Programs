class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int count0=0;
        int pos=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
                pos=i;
            }
            else{
                pro=pro*nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count0>1){
                nums[i]=0;
            }
            else if(count0==1){
                if(pos==i){
                    nums[i]=pro;
                }
                else{
                    nums[i]=0;
                }
            }
            else{
                nums[i]=pro/nums[i];
            }
            
        }
        return nums;
    }
}
public class Q238{
    public static void main(String[] args) {
        

    }
}