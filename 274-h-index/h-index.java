class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);
        int maxHIndex = 0;
        int totalPapers = citations.length;
       for (int i = totalPapers - 1; i >= 0; i--){
            int paperCount = totalPapers - i; 
            int currentPaperCitations = citations[i];
        if (currentPaperCitations >= paperCount) {
                maxHIndex = paperCount; 
            } else {
                break; 
            }         
       }
       return maxHIndex;
    }
}