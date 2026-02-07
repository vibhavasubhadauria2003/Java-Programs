import java.util.*;

class Solution {
    void merge(int nums[], int f, int m, int l) {
        int temp[] = new int[l - f + 1];
        int i = f, j = m + 1, k = 0;
        while (i <= m && j <= l) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= m) {
            temp[k++] = nums[i++];
        }
        while (j <= l) {
            temp[k++] = nums[j++];
        }
        i = f;
        for (k = 0; k < temp.length; k++) {
            nums[i++] = temp[k];
        }
    }

    void mergeSort(int nums[], int f, int l) {
        if (f < l) {
            int m = (f + l) / 2;
            mergeSort(nums, f, m);
            mergeSort(nums, m + 1, l);
            merge(nums, f, m, l);
        }
    }

    // void printArray(int nums[]){
    // for(int i=0;i<nums.length;i++){
    // System.out.println(nums[i]);
    // }
    // }
    public List<List<Integer>> threeSum(int[] nums) {
        mergeSort(nums, 0, nums.length);
        List<List<Integer>> threeSums = new ArrayList<>();
        return threeSums;
    }

}

public class Q15 {
    public static void main(String[] args) {
        Solution o1 = new Solution();
        int nums[] = { 5, 7, 12, 1, 3, 9 };
        o1.mergeSort(nums, 0, nums.length - 1);
        o1.printArray(nums);
    }
}
