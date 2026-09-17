class Solution {
    public int pivotInteger(int n) {
        int totalsum=0;
        for(int i = 1; i <= n; i++){
            totalsum += i;  
        }
        int leftsum=0;
        for(int i = 1; i <= n; i++){
            leftsum+=i;
            if(leftsum==totalsum-leftsum+i)return i;
        }
        
        return -1;
    }
}