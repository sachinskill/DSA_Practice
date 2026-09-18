class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int answer[]=new int[nums.length];
        for(int i=0;i<nums.length-1; i++){
            leftsum[i+1]=leftsum[i]+nums[i];
        }
        for(int j=nums.length-1; j>0; j--){
            rightsum[j-1]=rightsum[j]+nums[j];
        }
        for(int i=0;i<nums.length; i++){
            answer[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return answer;
    }
}