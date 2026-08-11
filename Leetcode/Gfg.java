//Allocate Minimum Pages
// Given an array arr[] of integers, where each element arr[i] represents the number of pages in the i-th book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

// Each student receives atleast one book.
// Each student is assigned a contiguous sequence of books.
// No book is assigned to more than one student.
// All books must be allocated.
// The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum. If it is not possible to allocate books to all students, return -1;

// Note: Test cases are generated such that the answer always fits in a 32-bit integer.

class Solution {
    boolean isValid(int arr[],int k,int maxAllowedPages){
        int person=0,c=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxAllowedPages){
                return false;
            }
            person=person+arr[i];
            if(person>maxAllowedPages){
                person=arr[i];
                c++;
            }
        }
        if(c<=k){    //   k is number of peples and c is number of people required
            return true;
        }
        else{
            return false;
        }
    }
    public int findPages(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }
        int f=0,l=0;
        for(int i=0;i<arr.length;i++){
            l=l+arr[i];
        }
        int mid=0;
        int min=l;
        while (f<=l) {
            mid=f+(l-f)/2;
            System.out.println(f+" "+mid+" "+l);
            if(isValid(arr, k, mid)){
                l=mid-1;
                if(mid<min){
                    min=mid;
                }
            }
            else{
                f=mid+1;
            }
            
        }
        return min;
    }
}
public class Gfg {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int nums[]={13,31,37,45,46,54,55,63,73,84,85};
        int k=9;
        int array=o1.findPages(nums, k);
        System.out.println(array);

    }
}
