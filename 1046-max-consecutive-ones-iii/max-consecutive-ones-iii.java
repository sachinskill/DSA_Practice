class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,wind=0, left=0,right=0;
        
        while(right<nums.length){
            if(nums[right]==1){
                wind=right-left+1;
                right++;
            }else if(nums[right]==0 && k!=0){
                 wind=right-left+1;
                k--;
                right++;
            }else if(nums[left]==0){
                k++;
                left++;
            }else{
                left++;
            }
            if(wind>max) max=wind;
        }
        return max;
    }
}