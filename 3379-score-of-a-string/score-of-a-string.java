class Solution {
    public int scoreOfString(String s) {
         int score = 0;
        
        // Loop through the string up to the second-to-last character
        for (int i = 0; i < s.length() - 1; i++) {
            // Math.abs calculates the absolute difference
            // s.charAt(i) automatically converts to its ASCII integer value during subtraction
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        
        return score;
    }
}