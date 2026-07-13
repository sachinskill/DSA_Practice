class Solution {
    public int maxVowels(String s, int k) {
        int maxvowel=0,wind=0, index=0;
        for(int i=0; i<k; i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                wind++; 
            }           
            if(maxvowel<wind){
                maxvowel=wind;
            }
        }
        for(int j=k; j<s.length(); j++){
            char left=s.charAt(j-k);
            if(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'){
                wind--;
            }
            int right=s.charAt(j);
            if(right=='a'||right=='e'||right=='i'||right=='o'||right=='u'){
                wind++;
            }
            
            maxvowel=Math.max(maxvowel, wind);          
        }
        return maxvowel;
    }
}