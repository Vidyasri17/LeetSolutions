class Solution {
    public int minimumPushes(String word) {
        List<Integer> list = new ArrayList<>();
        for(char ch = 'a'; ch <= 'z'; ch++){
            int cnt = 0;
            for(int i = 0; i < word.length(); i++){
                char ch2 = word.charAt(i);
                if(ch == ch2) cnt++;
            }
            list.add(cnt);
        }
        Collections.sort(list, Collections.reverseOrder());
        int cnt = 1;
        int ans = 0;
        int push = 1;
        for(int i: list){
            ans += i * push;
            if(cnt == push * 8) push++;
            cnt++;
        }
        return ans;
    }
}