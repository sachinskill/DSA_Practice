class Solution {
    public int singleNumber(int[] nums) {
       int ones = 0;
        int twos = 0;
        
        for (int num : nums) {
            // Update ones: include bits appearing once, exclude if in twos
            ones = (ones ^ num) & ~twos;
            // Update twos: include bits appearing twice, exclude if in ones
            twos = (twos ^ num) & ~ones;
        }
        
        return ones;
    }
}