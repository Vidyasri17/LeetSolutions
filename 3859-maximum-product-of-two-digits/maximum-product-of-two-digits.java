class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        list.sort(Comparator.reverseOrder());
        return list.get(0) * list.get(1);
    }
}