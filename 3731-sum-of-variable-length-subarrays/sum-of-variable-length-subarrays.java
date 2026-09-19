class Solution {
    public int subarraySum(int[] nums) {
        int start=0, sum=0, prefixsum[]=new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            start=Math.max(0,i-nums[i]);
            prefixsum[i+1]=prefixsum[i]+nums[i];
            if(start==0){
                sum+=prefixsum[i+1];
            }else{
                sum+=prefixsum[i+1]-prefixsum[start];
            }
        }
        return sum;
    }
}