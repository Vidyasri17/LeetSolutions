class Solution {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i: freq){
            if(i > 0) list.add(i);
        }
        if(list.size() <= k) return 0;
        Collections.sort(list);
        int ans = 0;
        int toDelete = list.size() - k;
        for(int i = 0; i < toDelete; i++){
            ans += list.get(i);
        }
        return ans;
    }
}