class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length >nums2.length){
            return intersect(nums2, nums1);
        }
        List<Integer> res=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: nums2){
            if(map.containsKey(num) && map.get(num)>0){
                map.put(num,map.get(num)-1);
                res.add(num);
            }
        }
        int ans[]=new int[res.size()];
        for(int i=0; i<res.size(); i++){
            ans[i]=res.get(i);
        }
       return ans;
    }   
}