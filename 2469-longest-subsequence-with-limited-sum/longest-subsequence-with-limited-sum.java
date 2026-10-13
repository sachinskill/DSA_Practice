class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int answer[]=new int[queries.length];
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0; i<queries.length; i++){
            int j=0;
            while(j<nums.length && queries[i]>=nums[j]){
                j++;
            }
            answer[i]=j;
        }
        return answer;
    }
}