class Solution {
    void clone2D(char[][]original,char [][] clone){
        for(int i=0;i<original.length;i++){
            clone[i]=original[i].clone();
        }
    }
    boolean backtrack(char[][] board,String word,int i,int j){
        
        //System.out.println("Selected: "+board[i][j]+" Remaining "+word +" i: "+i+" j: "+j);
        if(word.length()==0){
            return true;
        }
        else{
            boolean t1=false,t2=false,t3=false,t4=false;
            char c=board[i][j];
            if(i>0&&board[i-1][j]==word.charAt(0)){
                board[i][j]='0';
               // board[i][j]='0';
                t1=backtrack(board, word.substring(1), i-1, j);
            }
            if(j>0 && board[i][j-1]==word.charAt(0)){
                //System.out.println("yess");
                board[i][j]='0';
                //board[i][j]='0';
                t2=backtrack(board, word.substring(1), i, j-1);
            }
            if(j<board[0].length-1&&board[i][j+1]==word.charAt(0)){
                board[i][j]='0';
                //board[i][j]='0';
                t3=backtrack(board, word.substring(1), i, j+1);
            }
            if(i<board.length-1&&board[i+1][j]==word.charAt(0)){
                board[i][j]='0';
                //board[i][j]='0';
                t4=backtrack(board, word.substring(1), i+1, j);
            }
            board[i][j]=c;
            //printMatrix(board);
            if(t1==true||t2==true||t3==true||t4==true){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
    public boolean exist(char[][] board, String word) {
        boolean flag=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean a=backtrack(board, word.substring(1), i, j);
                    if(a==true){
                        flag=true;
                        break;
                    }
                }
            }
        }
        return flag;
    }
    // void printMatrix(char[][] m){
    //     System.out.println("---------------------------------------------");
    //     for(int i=0;i<m.length;i++){
    //         for(int j=0;j<m[0].length;j++){
    //             System.out.print(m[i][j]);
    //         }
    //         System.out.println("");
    //     }
    //     System.out.println("---------------------------------------------");
    // }
}
public class Q79 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        char [][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char [][]board1={{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        System.out.println(o1.exist(board1, "AAB"));
        //System.out.println(o1.exist(board, "ABCE"));

    }
}
