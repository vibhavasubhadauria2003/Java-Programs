

import java.util.*;


class Vigenere {
   String keyMapping(String plaintext, String key) {
        String newKey = "";
        int j = 0;
        for (int i = 0; i < plaintext.length(); i++) {
            if (j == key.length())
                j = 0;
            newKey += key.charAt(j);
            j++;
        }
        return newKey;
    }


     String encryption(String plaintext, String key) {
        String cyperText = "";
        for (int i = 0; i < plaintext.length(); i++) {
            int p = plaintext.charAt(i) - 65;
            int k = key.charAt(i) - 65;
            int c = (p + k) % 26;
            cyperText += (char) (c + 65);
        }
        return cyperText;
    }


    public static String decryption(String cypertext, String key) {
        String plaintext = "";
        for (int i = 0; i < cypertext.length(); i++) {
            int c = cypertext.charAt(i) - 65;
            int k = key.charAt(i) - 65;
            int p = (c - k);
            p = p < 0 ? p + 26 : p;
            p = p % 26;
            plaintext += (char) (p + 65);
        }
        return plaintext;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String plaintext = sc.nextLine();
        String text = "";
        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) == ' ')
                continue;
            text += plaintext.charAt(i);
        }
        plaintext = text.toUpperCase();

        Vigenere o1=new Vigenere();
        System.out.println("Enter key : ");
        String key = sc.nextLine();
        System.out.println("Plaintext : " + plaintext);
        System.out.println("Key : " + key);
        key = key.toUpperCase();
        key = o1.keyMapping(plaintext, key);
        System.out.println("Mapped key : " + key);
        String cyperText = o1.encryption(plaintext, key);
        System.out.println("Cypertext : " + cyperText);
        System.out.println("Original text : " + o1.decryption(cyperText, key));


        sc.close();
    }
}
