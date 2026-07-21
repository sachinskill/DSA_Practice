class Solution {
    public boolean canJump(int[] nums) {
        // farthest index we can reach so far
        int farthest = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If current index is beyond our farthest reach, we're stuck
            if (i > farthest) {
                return false;
            }
            
            // Update the farthest index we can reach from current position
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we can already reach or surpass the last index, return true
            if (farthest >= nums.length - 1) {
                return true;
   }
}
return true;
    }
}   