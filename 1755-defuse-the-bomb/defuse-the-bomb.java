class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int result[]=new int[n];
        if(k==0)return result;

        for(int i=0; i<n; i++){
           int sum=0;
           if(k>0){
            for(int step=1; step<=k; step++){
                int idx=(i+step)%n;
                sum+=code[idx];
            }
           }else{
            for(int step=1; step<=Math.abs(k); step++){
                int idx=(i-step+n)%n;
                sum+=code[idx];
            }
           }
           result[i]=sum;
        }     

        return result;
    }
}