class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        
        // Iterate through all numbers from 1 to n inclusive
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by 3, 5, or 7
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}