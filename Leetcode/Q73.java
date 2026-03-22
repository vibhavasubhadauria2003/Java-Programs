

class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean row[]=new boolean[matrix.length];
        boolean col[]=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(row[i]==true){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(col[i]==true){
                for(int j=0;j<matrix.length;j++){
                    
                    matrix[j][i]=0;
                }
            }
        }
        
    }
    void printArray(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

public class Q73 {
    public static void main(String[] args) {
        Solution o1 = new Solution();
        int nums[][] = {{0,1,2,0},{3,4,0,2},{7,3,1,5}};
        o1.setZeroes(nums);
        o1.printArray(nums);
    }
}
