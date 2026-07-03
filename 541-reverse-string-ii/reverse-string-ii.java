class Solution {
    public String reverseStr(String s, int k) {
      char[] ch=s.toCharArray();
      int n=ch.length;
      for(int low=0; low<n; low+=2*k){
       int high=Math.min(low + k-1,n-1);
        reverse(low,high,ch);
      }
      return String.valueOf(ch);
    }
    public static void reverse(int i,int j,char[] ch){
        while(i<j){
        char temp=ch[i];
        ch[i++]=ch[j];
        ch[j--]=temp;
        }
    }
}