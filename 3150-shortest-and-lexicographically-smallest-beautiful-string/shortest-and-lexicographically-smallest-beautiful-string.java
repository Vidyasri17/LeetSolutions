class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int n = s.length();
        int ones = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        for(int right  = 0; right < n; right++){
            if(s.charAt(right) == '1'){
                ones++;
            }
            if(ones == k){
                while(s.charAt(left) == '0'){
                    left++;
                }
                int temp = right - left + 1;
                if(minLen > temp){
                    minLen = temp;
                    ans = s.substring(left, left + minLen);
                }
                else if(minLen == temp){
                    String dup = s.substring(left, right + 1);
                    if(ans.compareTo(dup) > 0) ans = dup;
                }
                left++;
                ones--;
            }
        }
        return ans;
    }
}