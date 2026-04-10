class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a: asteroids){
            boolean isTrue = true;
            while(st.size() > 0 && a < 0 && st.peek() > 0){
                if(st.peek() < -a){
                    st.pop();
                    continue;
                }
                else if(st.peek() == -a){
                    st.pop();
                }
                isTrue = false;
                break;
            }
            if(isTrue){
                st.push(a);
            }
        }
        int[] ans = new int[st.size()];
        int inx = 0;
        for(int i: st) ans[inx++] = i;
        return ans;
    }
}