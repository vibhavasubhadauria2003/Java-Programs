class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int f=1,l=arr.length-2,mid=f;
        while(f<=l){
            mid=(f+l)/2;
            System.out.println(mid);
            if(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid]){
                return mid;
            }
            else if(arr[mid-1]<arr[mid]){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }
}

public class Q852 {
    
}
