class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum[]=new int[nums.length+1];
        int min=0;
        for(int i=0; i<nums.length; i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
            min=Math.min(min, prefixSum[i+1]);
        }
        return 1-min;
    }
}
