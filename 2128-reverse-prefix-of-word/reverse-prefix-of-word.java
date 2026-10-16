class Solution {
    public String reversePrefix(String word, char ch) {
         // Find the index of the first occurrence of character 'ch'
        int idx = word.indexOf(ch);
        
        // If 'ch' does not exist in word, return the original string
        if (idx == -1) {
            return word;
        }
        
        // Reverse the prefix from index 0 to idx (inclusive) and append the rest
        StringBuilder sb = new StringBuilder(word.substring(0, idx + 1));
        sb.reverse();
        sb.append(word.substring(idx + 1));
        
        return sb.toString();
    }
}