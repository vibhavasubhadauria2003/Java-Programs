import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=1;
        int i=0,j=1;
        
        while(i<s.length()&&j<=s.length()){
            HashSet<Character> hs=new HashSet<Character>();
            boolean check=false;
            String sub=s.substring(i, j);
            for(int k=0;k<sub.length();k++){
                if(hs.contains(sub.charAt(k))){
                    check=true;
                    break;
                }
                else{
                    hs.add(sub.charAt(k));
                }
            }
            if(check==true){
                i++;
            }
            else{
                if(sub.length()>max){
                    max=sub.length();
                }
                System.out.println(sub);
                j++;
            }
        }
       if(s.length()==0){
        max=0;
       }
        return max;
    }
}
public class Q3n {
    public static void main(String[] args) {
        Solution s1=new Solution();
        int max=s1.lengthOfLongestSubstring("aus");
        System.out.println(max);
    }
}

