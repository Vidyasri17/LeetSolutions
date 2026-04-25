class Solution {
    public String decodeString(String s) {
        StringBuilder curr = new StringBuilder();

        Stack<Integer> cnts = new Stack<>();
        Stack<StringBuilder> strs = new Stack<>();

        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }
            else if(ch == '['){
                cnts.push(num);
                strs.push(curr);
                num = 0;
                curr = new StringBuilder();
            }
            else if(ch == ']'){
                int times = cnts.pop();
                StringBuilder prev = strs.pop();
                while(times-- > 0) prev.append(curr);
                curr = prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}