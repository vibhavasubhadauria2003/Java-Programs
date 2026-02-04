
class Solution {
    public String longestPalindrome(String s) {
        String lsub = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                boolean flag = true;
                String tem = s.substring(i, j);
                for (int k = 0; k < tem.length(); k++) {
                    if (tem.charAt(k) != tem.charAt(tem.length() - k - 1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    if (tem.length() > lsub.length()) {
                        lsub = tem;
                        System.out.println(lsub);
                    }
                    
                }
            }
        }
        return lsub;
    }
}

public class Q5n {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        String max = s1.longestPalindrome("cbbd");
        System.out.println(max);
    }
}
