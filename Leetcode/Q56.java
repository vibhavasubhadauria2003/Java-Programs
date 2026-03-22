class Solution {
    void mergeArr(int nums[][], int f, int m, int l) {
        int temp[][] = new int[l - f + 1][2];
        int i = f, j = m + 1, k = 0;
        while (i <= m && j <= l) {
            if (nums[i][0] < nums[j][0]) {
                temp[k][0] = nums[i][0];
                temp[k][1] = nums[i][1];
                i++;
            } else {
                temp[k][0] = nums[j][0];
                temp[k][1] = nums[j][1];
                j++;
            }
            k++;
        }
        while (i <= m) {
            temp[k][0] = nums[i][0];
            temp[k][1] = nums[i][1];
            k++;
            i++;

        }
        while (j <= l) {
            temp[k][0] = nums[j][0];
            temp[k][1] = nums[j][1];
            j++;
            k++;
        }
        i = f;
        for (k = 0; k < temp.length; k++) {
            nums[i][0] = temp[k][0];
            nums[i][1] = temp[k][1];
            i++;
        }
    }

    void mergeSort(int nums[][], int f, int l) {
        if (f < l) {
            int m = (f + l) / 2;
            mergeSort(nums, f, m);
            mergeSort(nums, m + 1, l);
            mergeArr(nums, f, m, l);
        }
    }

    int maxInt(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int[][] merge(int[][] intervals) {
        mergeSort(intervals, 0, intervals.length - 1);
        int count = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = maxInt(intervals[i][1], intervals[i + 1][1]);
                intervals[i][0] = -1;
                count++;
            }
        }
        int arr[][] = new int[intervals.length - count][2];
        int i = 0, j = 0;
        while (i < intervals.length) {
            if (intervals[i][0] != -1) {
                arr[j][0] = intervals[i][0];
                arr[j][1] = intervals[i][1];
                j++;
            }
            i++;
        }
        return arr;
    }

    void printArray(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i][0]+" "+nums[i][1]);
        }
    }
}

public class Q56 {
    public static void main(String[] args) {
        Solution o1 = new Solution();
        int nums[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(nums.length);
        int arr[][]=o1.merge(nums);
        o1.printArray(arr);
    }
}
