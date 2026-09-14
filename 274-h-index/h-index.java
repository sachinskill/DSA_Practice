class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);
       int max=0;
       for(int i=citations.length-1; i>=0; i--){
        int count=citations.length-i;
        if(citations[i]>=count){
            max=count;
        }else{
            break;
        }      
       }
       return max;
    }
}