import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int arr[]=new int[nums.length-2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(dq.peekFirst()!=null && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            while(dq.peekLast()!=null&&nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(i+1-k>=0){
                arr[j++]=nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}

public class Q239 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int array[]=o1.maxSlidingWindow(nums, k);

    }
}
