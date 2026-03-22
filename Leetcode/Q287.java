class Solution {
    public int findDuplicate(int[] nums) {
        int freq[]=new int[nums.length];
        for(int i=0;i<freq.length;i++){
            freq[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]>0){
                return nums[i];
            }
            else{
                freq[nums[i]]++;
            }
        }
        return 0;
    }
}

public class Q287 {
    
}
