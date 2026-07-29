class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') continue;
            if(ch == '(') st.push(i);
            else {
                if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }
                else {
                    st.push(i);
                }
            }
        }
        boolean[] remove = new boolean[n];
        for(int i: st) remove[i] = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(!remove[i]) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
