
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxWater=0;
        while(i!=j){
            int water;
            if(height[i]<height[j]){
                water=height[i]*(j-i);
                i++;
            }
            else{
                water=height[j]*(j-i);
                j--;
            }
            if(water>maxWater){
                maxWater=water;
            }
        }
        return maxWater;
    }
}
public class Q11 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int h[]={1,2,3,4,5,6};
        int max = s1.maxArea(h);
        System.out.println(max);
    }
}
