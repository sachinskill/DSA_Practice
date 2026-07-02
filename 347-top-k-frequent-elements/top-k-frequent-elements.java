class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
            Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
        int arr[]=new int[k];
        for(int i=0; i<k; i++){
            int res=list.get(i);
           arr[i]=res;
        }
        return arr;
    }
}