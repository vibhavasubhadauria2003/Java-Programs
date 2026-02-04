import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=grid.length,arr[]=new int[2]; 
        for(int i=0;i<n*n;i++){
            hm.put(i+1,0);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hm.put(grid[i][j], hm.get(grid[i][j])+1);
            }
        }
        for (Map.Entry<Integer,Integer> e:hm.entrySet()) {
            if(e.getValue()==2){
                arr[0]=e.getKey();
            }
            else if(e.getValue()==0){
                arr[1]=e.getKey();
            }
        }
        return arr;
    }
}



public class Q2965 {
    
}
