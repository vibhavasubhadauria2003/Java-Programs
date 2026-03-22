import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<nums.length;i++){
            prefixSum=prefixSum+nums[i];
            if(hm.containsKey(prefixSum-k)){
                count=count+hm.get(prefixSum-k);
            }
            if(hm.containsKey(prefixSum)){
                hm.put(prefixSum, hm.get(prefixSum)+1);
            }
            else{
                hm.put(prefixSum, 1);
            }
        }
        return count;
    }
}

public class Q560 {
    public static void main(String[] args) {
        Solution o1 = new Solution();
        int arr[] = { 1, -1, 0 };
        System.out.println(o1.subarraySum(arr, 0));
    }
}
