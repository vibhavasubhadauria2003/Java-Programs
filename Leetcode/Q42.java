class Solution {
    public int trap(int[] height) {
        int totalWater = 0,leftmax = 0,rightmax = height.length - 1;
        int left = leftmax + 1,right = rightmax - 1;
        while (left <= right) {
            if (height[leftmax] < height[rightmax]) {
                if (height[left] > height[leftmax])
                    leftmax = left;
                else
                    totalWater = totalWater + (height[leftmax] - height[left]);
                left++;
            } else {
                if (height[right] > height[rightmax])
                    rightmax = right;
                else
                    totalWater = totalWater + (height[rightmax] - height[right]);
                right++;
            }
        }
        return totalWater;
    }
}

public class Q42 {

}
