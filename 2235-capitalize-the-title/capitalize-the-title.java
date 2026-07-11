class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb;
        String[] words = title.split(" ");
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.length() <= 2){
                word = word.toLowerCase();
            }
            else{
                word = word.toLowerCase();
                word = (char)(word.charAt(0) - 32) + word.substring(1);
            }
            words[i] = word;
        }
        return String.join(" ", words);
    }
}