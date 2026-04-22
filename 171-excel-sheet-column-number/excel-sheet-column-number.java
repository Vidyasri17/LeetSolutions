class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0, base = 0;
        int n = columnTitle.length();
        for(int i = n - 1; i >= 0; i--){
            int temp = columnTitle.charAt(i) - 'A' + 1;
            num += (temp * Math.pow(26, base++));
        }
        return num;
    }
}