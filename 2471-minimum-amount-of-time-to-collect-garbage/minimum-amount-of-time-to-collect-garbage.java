class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        HashMap<Character, Integer> map=new HashMap<>();
        int prefixsum[]=new int[travel.length+1];
        for(int i=0; i<travel.length; i++){
            prefixsum[i+1]=prefixsum[i]+travel[i];
        }
        int count=0;
        for(int i=0; i<garbage.length; i++){
            String str=garbage[i];
            for(char ch:str.toCharArray()){
                map.put(ch,i);
            }
            count+=str.length();
            
        }
        int sum=0;
        for(int n:map.values()){
            sum+=prefixsum[n];
        }
        return count+sum;

    }
}