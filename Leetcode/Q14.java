package Leetcode;


class Solution {
    public String shortestString(String str[]){
        String s=str[0];
        for(int i=0;i<str.length;i++){
            if(str[i].length()<s.length()){
                s=str[i];
            }
        }
        return s;
    }
    public String longestCommonPrefix(String[] strs) {
        String smallestString=shortestString(strs);
        String commString="";
        for(int i=0;i<smallestString.length();i++){
            boolean flag=true;
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=smallestString.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                commString=commString+smallestString.charAt(i);
            }
            else{
                break;
            }
        }
        return commString;
    }
}
public class Q14 {
    
}
