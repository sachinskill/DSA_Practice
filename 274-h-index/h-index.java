class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);
       for(int i=0; i<citations.length; i++){
        int hcount=citations.length-i;
        if(citations[i]>=hcount){
            return hcount;
        }
       }
       return 0;
    }
}