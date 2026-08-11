
//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

import java.util.Hashtable;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Hashtable<Character,Integer> ht=new Hashtable<>();
        for(int i=0;i<s.length();i++){
            if(ht.containsKey(s.charAt(i))){
                ht.put(s.charAt(i),ht.get(s.charAt(i))+1);
            }
            else{
                ht.
            }
            
        }
    }
}

public class q242 {
    
}
