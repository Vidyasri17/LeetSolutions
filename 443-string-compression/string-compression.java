class Solution {
    public int compress(char[] chars) {
        int inx = 0;
        int i = 0;
        int n = chars.length;
        while(i < n){
            int cnt = 0, j = i;
            char ch = chars[i];
            while(j < n && chars[j] == ch){
                cnt++;
                j++;
                i++;
            }
            chars[inx++] = ch;
            if(cnt > 1){
                String s = String.valueOf(cnt);
                int k = 0;
                while(k < s.length()){
                    chars[inx++] = (char)(s.charAt(k++));
                }
            }
        }
        return inx;
    }
}