
import java.io.*;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        try {
            File f1=new File("name.txt");
            f1.createNewFile();

            FileWriter f2= new FileWriter("name.txt");
            f2.write("Alice\nBob\nCharlie\nDavid");
            f2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
