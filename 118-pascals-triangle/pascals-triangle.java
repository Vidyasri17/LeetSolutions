class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        lst.add(prev);
        if(rows == 1) return lst;
        for(int i = 2; i <= rows; i++){
            prev = lst.get(i - 2);
            int n = prev.size();
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0; j < n; j++){
                if(j + 1 < n) curr.add(prev.get(j) + prev.get(j + 1));
                else curr.add(prev.get(j));
            }
            
            lst.add(curr);
        }
        return lst;
    }
}