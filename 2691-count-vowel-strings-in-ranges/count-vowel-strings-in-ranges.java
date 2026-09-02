class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefixsum[]=new int[words.length+1];
        int n=words.length;
        for(int i=0; i<n; i++){
            String word = words[i];
            boolean isValid=isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1));
            prefixsum[i+1]=prefixsum[i]+ (isValid ? 1 : 0);

        }
        int[] ans=new int[queries.length];
            for(int i=0; i<queries.length; i++){
                int l=queries[i][0];
                int r=queries[i][1];

                ans[i]=prefixsum[r+1]-prefixsum[l];
            }

        return ans;
    
    }
    public boolean isVowel(char c){
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
} 