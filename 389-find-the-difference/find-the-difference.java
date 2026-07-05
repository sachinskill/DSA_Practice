class Solution {
    public char findTheDifference(String s, String t) {
        int[] alpha=new int[26];
        for(char ch: s.toCharArray()){
            alpha[ch-'a']+=1;
        }
        for(char c: t.toCharArray()){
            if(alpha[c-'a']==0 ) return c;

            alpha[c-'a']-=1;
        }
        return ' ';
    }
}
