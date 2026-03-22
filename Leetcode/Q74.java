class Solution {
    int binarySearch(int matrix[][],int f,int l,int target){
        if(f<=l){
            int m=(f+l)/2;
            
            int col=matrix[0].length;
            //System.out.println(matrix[m/col][m%col]);
            if(matrix[m/col][m%col]==target){
                return m;
            }
            else if(matrix[m/col][m%col]<target){
                return binarySearch(matrix, m+1, l, target);
            }
            else{
                return binarySearch(matrix, f, m-1, target);
            }
        }
        else{
            return -1;
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=matrix[0].length;
        int row=matrix.length;
        int found=binarySearch(matrix, 0, row*col-1, target);
        if(found>=0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Q74 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int [][]matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(o1.searchMatrix(matrix, 3));

    }
}
