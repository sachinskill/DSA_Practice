class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int n = image.length;
        
        for (int[] row : image) {
            int left = 0;
            int right = n - 1;
            
            // Process elements from both ends towards the center
            while (left <= right) {
                // If elements are identical, they will change value after inversion
                if (row[left] == row[right]) {
                    // Invert using XOR with 1
                    int temp = row[left] ^ 1;
                    row[left] = temp;
                    row[right] = temp;
                }
                // If elements are different, their positions swap and invert,
                // which leaves their values unchanged. No action needed!
                
                left++;
                right--;
            }
        }
        
        return image;
    }
}