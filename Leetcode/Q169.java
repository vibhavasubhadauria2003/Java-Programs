
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==false){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        int maxKey=nums[0],maxValue=0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>maxValue){
                maxValue=e.getValue();
                maxKey=e.getKey();
            }
        }
        //System.out.println("Key: "+maxKey+"  Value: "+maxValue);
        if(maxValue>(nums.length)/2){
            return maxKey;
        }
        else{
            return 0;
        }

    }
}

public class Q169 {
    public static void main(String[] args) {
        int arr[]={3,2,3};
        Solution o1 = new Solution();
        int a=o1.majorityElement(arr);
        System.out.println(a);
    }
    
}
