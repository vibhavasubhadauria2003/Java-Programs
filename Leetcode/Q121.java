class Solution {
    public int maxProfit(int[] prices) {
        int maxPfr=0;
        int minPrice=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            if((prices[i]-minPrice)>maxPfr){
                maxPfr=prices[i]-minPrice;
            }
        }
        return maxPfr;
    }
}

public class Q121 {
    
}
