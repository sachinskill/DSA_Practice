class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String res=goal+goal;
        if (res.contains(s)) return true;
       return false; 
    }
}