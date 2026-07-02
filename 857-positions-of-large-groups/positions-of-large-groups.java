class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            int j = i;
            int cnt = 0;
            while(j < s.length() && s.charAt(j) == ch){
                cnt++;
                j++;
            }
            
            if(cnt > 2){
                List<Integer> lst = new ArrayList<>();
                lst.add(i);
                lst.add(j - 1);
                ans.add(lst);
            }
            i = j;
        }
        return ans;
    }
}