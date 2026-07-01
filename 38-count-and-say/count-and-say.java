class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for(int i = 2; i <= n; i++){
            int j = 0;
            StringBuilder sb = new StringBuilder();
            
            while(j < ans.length()){
                char ch = ans.charAt(j); 
                int count = 0;               
                while(j < ans.length() && ans.charAt(j) == ch){
                    j++;
                    count++;
                }
                sb.append(count);
                sb.append(ch);
            }
            ans = sb.toString();
        }
        return ans;
    }
}