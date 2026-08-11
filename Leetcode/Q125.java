class Solution {
    public boolean alphanumeric(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        } else if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
    public int findAlphaNumric(String s, int index, int upgrade) {
        while (index >= 0 && index < s.length() && alphanumeric(s.charAt(index)) == false) {
            index = index + (upgrade);
        }
        System.out.println(index);
        return index;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int f = findAlphaNumric(s, 0, 1), l = findAlphaNumric(s, s.length() - 1, -1);
        while (f < l) {
            if (s.charAt(f) == s.charAt(l)) {
                System.out.println(f +"  "+l);
                f = findAlphaNumric(s, f + 1, l);
                l = findAlphaNumric(s, l - 1, -1);
            } else {
                return false;
            }
        }
        return true;
    }
}
public class Q125 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        boolean result = s1.isPalindrome("race a car");
        System.out.println(result);
    }
}
