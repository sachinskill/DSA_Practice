class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            
            boolean result=isPalindrom(words[i]);
            if(result) return words[i];
        }
        return "";
    }
    public static boolean isPalindrom(String word){
        int l=0, r=word.length()-1;
        while(l<r){
                if(word.charAt(l)!=word.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
    }
}