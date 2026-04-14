class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(word.length() > 0){
                    sb.append(word).append(" ");
                    word.setLength(0);
                } 
            }
            else{
                word.insert(0, ch);
            }
        }
        if(word.length() > 0) sb.append(word);
        return sb.toString().trim();
    }
}