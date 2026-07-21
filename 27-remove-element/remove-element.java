class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next position of a non-val element      
        for (int i = 0; i < nums.length; i++) {
            // If current element is not equal to val, keep it
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Move the pointer forward
            }
        }        
        return k; 
    }
}