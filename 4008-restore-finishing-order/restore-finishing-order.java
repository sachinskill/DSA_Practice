class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: friends){
            set.add(i);
        }
        int j=0;
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
                friends[j++]=order[i];
            }
        }
        return friends;
    }
}