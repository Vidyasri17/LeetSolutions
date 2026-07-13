class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(int start = 1; start <= 9; start++){
            int digit = start + 1;
            int num = start;
            while(digit <= 9){
                num = num * 10 + digit;
                if(num <= high && num >= low) list.add(num);
                if(num > high) break;
                digit++;
            }  
        }
        Collections.sort(list);
        return list;
    }
}