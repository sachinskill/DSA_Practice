class Solution {
    public String[] findWords(String[] words) {
        int arr[]=new int[26];
        String f="qwertyuiop";
        String s="asdfghjkl";
        String z="zxcvbnm";
        for(int i=0; i<26; i++){
            if(i<10){
            char c=f.charAt(i);
            arr[c-'a']=1;
            }else if(i<19){
            char c=s.charAt(i-10);
            arr[c-'a']=2; 
            }else{
            char c=z.charAt(i-19);
            arr[c-'a']=3;    
            }
            
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String str=words[i];
            char ch=Character.toLowerCase(str.charAt(0));
            int row=arr[ch-'a'];
            boolean wrd=true;
            for(char c: str.toCharArray()){
                c=Character.toLowerCase(c);
                if(arr[c-'a']!=row){
                    wrd=false;
                    break;
                }
            }
            if(wrd){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}