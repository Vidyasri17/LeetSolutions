class Solution {
    public List<Integer> getRow(int rows) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        if(rows == 0) return prev;
        for(int i = 2; i <= rows + 1; i++){
            int n = prev.size();
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0; j < n; j++){
                if(j + 1 < n) curr.add(prev.get(j) + prev.get(j + 1));
                else curr.add(prev.get(j));
            }
            
            prev = curr;
        }
        return prev;
    }
}