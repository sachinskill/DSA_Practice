class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
          // 1. Put banned words into a HashSet for O(1) lookups
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        // 2. Replace all punctuation with spaces and convert to lowercase
        // "[!?',;.\\s]+" matches any combination of punctuation or whitespace
        String[] words = paragraph.toLowerCase().split("[!?',;.\\s]+");

        // 3. Count frequencies of valid words
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            // Skip empty strings that might happen from split
            if (word.isEmpty()) continue;
            
            // Skip if the word is banned
            if (!bannedSet.contains(word)) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // 4. Find the word with the highest frequency
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
}