class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         boolean[] isAllowed = new boolean[26];
        
        // Mark the allowed characters as true
        for (int i = 0; i < allowed.length(); i++) {
            isAllowed[allowed.charAt(i) - 'a'] = true;
        }
        
        int consistentCount = 0;
        
        // Check each word in the words array
        for (String word : words) {
            boolean isConsistent = true;
            
            // Check if every character of the current word is allowed
            for (int i = 0; i < word.length(); i++) {
                if (!isAllowed[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break; // Stop checking this word immediately
                }
            }
            
            // If the word passed the check, increment the counter
            if (isConsistent) {
                consistentCount++;
            }
        }
        
        return consistentCount;
    }
}