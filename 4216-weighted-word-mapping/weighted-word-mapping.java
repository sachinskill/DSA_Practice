class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
         StringBuilder result = new StringBuilder();
        for (String word : words) {
            int totalWeight = 0;         
            // Calculate the sum of weights for each character in the word
            for (char c : word.toCharArray()) {
                totalWeight += weights[c - 'a'];
            }          
            // Take weight modulo 26
            int remainder = totalWeight % 26;           
            // Map 0 -> 'z', 1 -> 'y', ..., 25 -> 'a' using reverse alphabetical order
            char mappedChar = (char) ('z' - remainder);
            result.append(mappedChar);
        }   
        return result.toString();
    }
}