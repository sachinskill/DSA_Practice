class Solution {
    public int reverseDegree(String s) {
         int totalDegree = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 'a' -> 26, 'b' -> 25, ..., 'z' -> 1
            int revAlphabetValue = 26 - (ch - 'a');
            // 1-indexed position in the string
            int stringIndex = i + 1; 
            
            totalDegree += revAlphabetValue * stringIndex;
        }
        
        return totalDegree; 
    }
}