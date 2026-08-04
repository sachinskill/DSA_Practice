class Solution {
    public int findComplement(int num) {
      // Find the number of bits in the binary representation of num
        int bitLength = (int)(Math.log(num) / Math.log(2)) + 1;
        
        // Create a mask with all 1s of that specific bit length
        int mask = (1 << bitLength) - 1;
        
        // XOR the number with the mask to flip its bits
        return num ^ mask;  
    }
}