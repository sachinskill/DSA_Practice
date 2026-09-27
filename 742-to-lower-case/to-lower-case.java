class Solution {
    public String toLowerCase(String s) {
        StringBuilder st=new StringBuilder();
        for(char c:s.toCharArray()){
            char lower=Character.toLowerCase(c);
            st.append(lower);
        }
        return st.toString();
    }
}