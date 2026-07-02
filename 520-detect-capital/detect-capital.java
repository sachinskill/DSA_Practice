class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase=0;
        for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
           if(ch==Character.toUpperCase(ch)){
            uppercase++;
           }
        }
        if(uppercase==word.length() || uppercase==0){
            return true;
           }
        if(uppercase==1 && Character.isUpperCase(word.charAt(0))){ 
            return true;
        }
            return false;
    }
}