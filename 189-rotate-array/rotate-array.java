class Solution {
    public static void reverse(int start, int end, int[] nums){
        while(start<=end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
       if(k%nums.length==0)return;
       int n=nums.length;
       k=k%n;
       reverse(0,n-1, nums);
       reverse(0,k-1, nums);
       reverse(k,n-1, nums);
    }
   
}