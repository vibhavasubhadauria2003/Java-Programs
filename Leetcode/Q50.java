class Solution {
    public double myPow(double x, int n) {
        double pow=1;
        String binary="";
        int a=n;
       // System.out.println(n);
        while(n!=0){
            if(n%2==0){
                binary="0"+binary;
            }
            else{
                binary="1"+binary;
            }
            n=n/2;
        }
       // System.out.println(binary);
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                if(a>0){
                    pow*=x;
                }
                else if(a<0){
                    pow/=x;
                }
            }
            x=x*x;
        }
        return pow;
    }
}


public class Q50 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        double pow=o1.myPow(2.0, -2147483648);
        System.out.println(pow);
    }
    
}
