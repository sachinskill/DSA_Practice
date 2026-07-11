class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map=new HashMap<>();
        String f="qwertyuiop";
        String s="asdfghjkl";
        String z="zxcvbnm";
        for(int i=0; i<26; i++){
            if(i<10){
            char c=f.charAt(i);
            map.put(c,1);
            }else if(i<19){
            char c=s.charAt(i-10);
            map.put(c,2); 
            }else{
            char c=z.charAt(i-19);
            map.put(c,3);    
            }
            
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String str=words[i];
            char ch=Character.toLowerCase(str.charAt(0));
            int row=map.get(ch);
            boolean wrd=true;
            for(char c: str.toCharArray()){
                c=Character.toLowerCase(c);
                if(map.getOrDefault(c,0)!=row){
                    wrd=false;
                    break;
                }
            }
            if(wrd){
                arr.add(words[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}