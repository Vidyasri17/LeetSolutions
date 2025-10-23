class Solution {
    public boolean hasSameDigits(String s) {
        int len = s.length();
        while(len != 2){
            s = check(s);
            len = s.length();
        }
        return (s.charAt(0) == s.charAt(1));
    }
    public String check(String s){
        int len = s.length();
        char[] arr = new char[len - 1];
        for(int i = 0; i + 1 < len; i++){
            int sum = (int)s.charAt(i) - '0' + (int)s.charAt(i + 1) - '0';
            arr[i] = (char)(sum % 10 + '0');
        }
        return new String(arr);
    }
}