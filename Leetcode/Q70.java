class Solution {
    public void sortColors(int[] nums) {
        int count[]={0,0,0};
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=1;j<=count[i];j++){
                nums[k++]=i;
            }
        }
    }
}
public class Q70 {
    
}
