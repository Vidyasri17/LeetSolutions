class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int l = 0, r = s.length() - 1;
        while(l < r){
            char ch1 = sb.charAt(l);
            char ch2 = sb.charAt(r);
            if(vowels.contains("" + ch1) && vowels.contains("" + ch2)){
                sb.replace(l, l + 1, "" + ch2);
                sb.replace(r, r + 1, "" + ch1);
                l++;
                r--;
            }
            else if(vowels.contains("" + ch1)){
                r--;
            }
            else if(vowels.contains("" + ch2)){
                l++;
            }
            else{
                l++;
                r--;
            }
        }
        return sb.toString();
    }
}