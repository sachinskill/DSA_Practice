class Solution {
    public int maxProfit(int[] prices) {
        int i=0, j=0, result=0;
        while(j<prices.length){
            if(prices[i]<prices[j] && prices[j]>prices[j-1]){
                result+=prices[j]-prices[i];
                j++;
                i++;
            }else{
                i=j;
                j++;
            }
        }
        return result;
    }
}