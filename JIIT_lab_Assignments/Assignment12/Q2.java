
import java.io.*;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        try {
            File f1=new File("name.txt");
            File f2=new File("copy_name.txt");
            f2.createNewFile();
            FileWriter f3= new FileWriter("copy_name.txt");
            Scanner sc=new Scanner(f1);
            String line;
            while (sc.hasNextLine()) {
                line=sc.nextLine();
                f3.write(line+"\n");
                System.out.println(line);
            }
            f3.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
