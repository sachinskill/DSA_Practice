class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        double max=sum;
        int left=0;
        for(int j=k; j<nums.length; j++){
            sum=sum-nums[left]+nums[j];
            left++;
            max=Math.max(max,sum);
        }
        return max/k;
    }
}