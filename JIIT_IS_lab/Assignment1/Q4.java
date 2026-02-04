import java.util.ArrayList;
import java.util.HashSet;

class PlayFair {
    char[][] fillMatrix(String key) {
        char matrix[][] = new char[5][5];
        HashSet<Character> hs = new HashSet<>();
        int counter = 0;
        for (int k = 0; k < key.length(); k++) {
            char c = key.charAt(k);
            if (c == 'J') {
                c = 'I';
            }
            if (hs.contains(c) == false) {
                hs.add(c);
                matrix[counter / 5][counter % 5] = c;
                counter++;
            }
        }
        for (char k = 'A'; k <= 'Z'; k++) {
            if (k == 'J') {
                continue;
            } else {
                if (hs.contains(k) == false) {
                    matrix[counter / 5][counter % 5] = k;
                    counter++;
                }
            }
        }
        return matrix;
    }
    ArrayList<String> createPairs(String plaintxt){
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<plaintxt.length();i++){
            if(i==plaintxt.length()-1){
                al.add(plaintxt.charAt(i)+"X");
            }
            else if(plaintxt.charAt(i)==plaintxt.charAt(i+1)){
                al.add(plaintxt.charAt(i)+"X");
            }
            else{
                al.add(""+plaintxt.charAt(i)+plaintxt.charAt(i+1));
                i++;
            }
        }
        return al;
    }
    int[] search(char ch, char matrix[][]) {
        if (ch=='J')
            ch = 'I';
        int index[] = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (ch==matrix[i][j]){
                    index[0]=i;
                    index[1]=j;
                }    
            }
        }
        return index;
    }

    String encryptTxt(ArrayList<String> pairs,char matrix[][]){
         String cyperText = "";
        int n = matrix.length;


        for (String s : pairs) {
            int index1[] = search(s.charAt(0) , matrix);
            int index2[] = search(s.charAt(1) , matrix);
            int i1 = index1[0];
            int j1 = index1[1];
            int i2 = index2[0];
            int j2 = index2[1];
            if (i1 == i2) { // for same row
                if (j1 == n - 1)
                    cyperText += matrix[i1][0];
                else
                    cyperText += matrix[i1][j1 + 1];
                if (j2 == n - 1) {
                    cyperText += matrix[i2][0];
                } else {
                    cyperText += matrix[i2][j2 + 1];
                }
            } else if (j1 == j2) { // for same column
                if (i1 == n - 1)
                    cyperText += matrix[0][j1];
                else
                    cyperText += matrix[i1 + 1][j1];
                if (i2 == n - 1) {
                    cyperText += matrix[0][j2];
                } else {
                    cyperText += matrix[i2 + 1][j2];
                }
            } else { // diagonal
                cyperText += matrix[i1][j2];
                cyperText += matrix[i2][j1];
            }


        }
        return cyperText;

    }
    void printPairs(ArrayList<String> pairs){
        System.out.println("All pairs are ");
        for (String string : pairs) {
            System.out.print(string+", ");
        }
        System.out.println("");
    }

    void printMatrix(char matrix[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        PlayFair o1 = new PlayFair();
        String key="Vibhavasu";
        String plaintxt="MrBoss";
        key=key.toUpperCase();
        plaintxt=plaintxt.toUpperCase();
        
        char matrix[][] = o1.fillMatrix(key);
        o1.printMatrix(matrix);
        System.out.println("Plain Text: "+plaintxt);
        System.out.println("Key: "+key);
        ArrayList<String> pairs= o1.createPairs(plaintxt);
        o1.printPairs(pairs);
        String cyperText= o1.encryptTxt(pairs, matrix);
        System.out.println("Cyper Text: "+cyperText);
    }
}
