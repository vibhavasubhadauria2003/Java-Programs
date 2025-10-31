
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String maxSub="";
        int max=0;
        for(int j=0;j<s.length();j++){
            for(int i=j;i<=s.length();i++){
            String sub=s.substring(j, i);
           // System.out.println(sub);
            boolean check=false;
            int a[]=new int[200];
            for(int k=32;k<127;k++){
                a[k]=0;
            }
            for(int k=0;k<sub.length();k++){
                char c=sub.charAt(k);
                a[(int)c]++;
            }
            for(int k=32;k<127;k++){
                if(a[k]>1){
                    check=true;
                }
            }
            if(check==false && sub.length()>max){
                max=sub.length();
                maxSub=sub;
            }
        }
        }
       // System.out.println(maxSub);
        return max;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Solution s1=new Solution();
        int max=s1.lengthOfLongestSubstring("vibhavasu");
        System.out.println(max);
    }
}
