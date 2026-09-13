class Solution {
    public int jump(int[] nums) {
      int jump=0;
      int coverage=0;
      int lastjumpidx=0;
      if(nums.length==1) return 0;
      for(int i=0; i<nums.length; i++){
        coverage=Math.max(coverage, i+nums[i]);
        if(i==lastjumpidx){
            lastjumpidx=coverage;
            jump++;
            if(coverage>=nums.length-1){
                return jump;
            }
        }
      }
        return jump;
    }
}