class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int freq=0;
        for(int count: map.values()){
            if(count%2==0){
                freq+=count;             
            }else{
                freq+=count-1;
               
            }
        }
        if(freq<s.length()){
            freq += 1;
        }
        return freq;
    }
}