
class Solution {
    public String longestPalindrome(String s) {
        String lsub="";
        
        int i=0,j=1;
        while(i<s.length()&&j<=s.length()){
            boolean flag=true;
            String tem=s.substring(i,j);
            for(int k=0;k<tem.length();k++){
                if(tem.charAt(k)!=tem.charAt(tem.length()-k-1)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                if(tem.length()>lsub.length()){
                    lsub=tem;
                    System.out.println(lsub);
                }
                j++;
                System.out.println("j increased"+j);
            }
            else{
                i++;
            }
        }
        return lsub;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Solution s1=new Solution();
        String max=s1.longestPalindrome("auaj");
        System.out.println(max);
    }
}
