class Solution {
    public String[] findWords(String[] words) {
        String line1 = "QWERTYUIOPqwertyuiop";
        String line2 = "ASDFGHJKLasdfghjkl";
        String line3 = "ZXCVBNMzxcvbnm";
        List<String> ans = new ArrayList<>();
        for(String word: words){
            boolean found1 = false, found2 = false, found3 = false;
            for(char ch: word.toCharArray()){
                if(line1.contains("" + ch)) found1 = true;
                else if(line2.contains("" + ch)) found2 = true;
                else if(line3.contains("" + ch)) found3 = true;
            }
            if(found1 && !found2 && !found3) ans.add(word);
            else if(!found1 && found2 && !found3) ans.add(word);
            else if(!found1 && !found2 && found3) ans.add(word);
        }
        String[] arr = new String[ans.size()];
        int inx = 0;
        for(String word: ans) arr[inx++] = word;
        return arr;
    }
}