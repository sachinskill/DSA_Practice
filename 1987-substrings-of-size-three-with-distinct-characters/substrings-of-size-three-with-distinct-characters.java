class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)return 0;
        Map<Character, Integer> map=new HashMap<>();
        int count=0, k=3;
        for(int i=0; i<k; i++){
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        if(map.size()==k){
            count=1;
        }
        for(int i=k; i<s.length(); i++){
            char left=s.charAt(i-k);
            if(map.get(left)>1){
                map.put(left, map.get(left)-1);
            }else{
            map.remove(left);
            }
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
            if(map.size()==k){
            count+=1;
        }
        }
        return count;
    }
}