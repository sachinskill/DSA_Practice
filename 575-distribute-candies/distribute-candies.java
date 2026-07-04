class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int n=candyType.length;
        for(int i: candyType){
            set.add(i);
        }
        if(set.size()<=n/2) {
            return set.size();
        }

        return n/2;
    }
}