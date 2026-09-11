class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalsum=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int length=j-i+1;
                int subarrsum=0;
                if(length%2==1){
                for(int k=i; k<=j; k++){
                    subarrsum+=arr[k];
                }
                totalsum+=subarrsum;
                }
            }
        }
        return totalsum;
    }
}