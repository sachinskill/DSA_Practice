class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]=new int[nums.length];
        Arrays.fill(arr, -1);
        if(k==0) return nums; 
        long window=2*k+1;
        if(window>nums.length)return arr;
        long sum=0;
        for(int i=0; i<window; i++){
           sum+=nums[i];
        }
        arr[k] = (int)(sum / window);
        
        for(int center=k+1; center<nums.length-k; center++){           
            sum-=nums[center-k-1];
            sum+=nums[center+k];
            arr[center] = (int)(sum / window);
            }       
        return arr;
    }
}