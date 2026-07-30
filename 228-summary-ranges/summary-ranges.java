class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            
            // Advance `i` while consecutive elements are contiguous
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            // Format the range based on whether it spans multiple values or just one
            if (start != nums[i]) {
                result.add(start + "->" + nums[i]);
            } else {
                result.add(String.valueOf(start));
            }
        }
        
        return result;
    }
}