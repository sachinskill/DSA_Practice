class Solution {
    public int maxVowels(String s, int k) {
        int maxvowel=0,vowel=0, index=0;
        for(int i=0; i<k; i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++; 
            }           
            if(maxvowel<vowel){
                maxvowel=vowel;
            }
        }
        for(int j=k; j<s.length(); j++){
            char c=s.charAt(j);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                int left=s.charAt(index);
                if(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'){
                vowel=vowel+1-1;
                }else{
                    vowel=vowel+1;
                }
            }else{
                int left=s.charAt(index);
                if(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'){
                    vowel--;
                }
            }
            index++;
            maxvowel=Math.max(vowel, maxvowel);
            
        }
        return maxvowel;
    }
}