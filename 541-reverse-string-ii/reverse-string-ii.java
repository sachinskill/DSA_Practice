class Solution {
    public String reverseStr(String s, int k) {
       char ch[]=s.toCharArray();
       int n=ch.length;
       for(int low=0; low<n; low+=2*k){
            int high=Math.min(low+k-1,n-1);
            reverse(low,high,ch);
       }
       return String.valueOf(ch);
    }
    public static void reverse(int low, int high, char[]ch){
        while(low<high){
        char temp=ch[low];
        ch[low++]=ch[high];
        ch[high--]=temp;
    }
    }
   
}