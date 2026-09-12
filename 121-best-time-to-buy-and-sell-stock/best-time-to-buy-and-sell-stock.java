class Solution {
    public int maxProfit(int[] prices) {
        int i=0, max=0, result=0, j=1;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                result=prices[j]-prices[i];
                max=Math.max(result,max);
                j++;
            }else{
                i=j;
                j++;
            }
        }
        return max;
    }
}