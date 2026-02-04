
import java.io.File;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int count=0;
        try {
            File f1=new File("name.txt");
            Scanner sc=new Scanner(f1);
            String line;
            while(sc.hasNextLine()){
                line=sc.nextLine();
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i)==' '&&line.charAt(i-1)!=' '){
                        count++;
                    }
                }
                count++;
            }
            System.out.println("Number of words: "+count);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
