
class Solution {
    int count;
    public void merge(int nums[],int f,int m,int l){
        int i=f;
        int j=m+1,k=0;
        int arr[]=new int[l-f+1];
        while(i<=m && j<=l){
            if(nums[i]<nums[j]){
                arr[k++]=nums[i++];
            }
            else{
                arr[k++]=nums[j++];
            }
        }
        while(i<=m){
            arr[k++]=nums[i++];
        }
        while (j<=l) {
            arr[k++]=nums[j++];
        }
        int x=0;
        for(i=f;i<=l;i++){
            nums[i]=arr[x++];
        }
    }
    public void count_rev_pair(int nums[],int f,int m,int l){
        System.out.println("Range :"+f+" "+m+" "+l);
        int i=f,j=m+1;
        while (i<=m&&j<=l) {
            double t1=(double)nums[i]/2;
            System.out.println("xxxxx "+nums[i]+" "+ t1);
            if(t1 > nums[j]){
                count=count+(m-i+1);
                System.out.println("i:"+nums[i]+" j:"+nums[j]);
                j++;
            }
            else{
                i++;
            }
        }
    }
    public void merge_sort(int nums[],int f,int l){
        if(f<l){
            int m=(f+l)/2;
            merge_sort(nums, f, m);
            merge_sort(nums, m+1, l);
            count_rev_pair(nums, f, m, l);
            merge(nums, f, m, l);
        }
    }
    public int reversePairs(int[] nums) {
        merge_sort(nums, 0, nums.length-1);
        return count;
    }
}
public class Q493 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int nums[]={1,3,2,3,1};
        int c=o1.reversePairs(nums);
        System.out.println(c);
    }
}
