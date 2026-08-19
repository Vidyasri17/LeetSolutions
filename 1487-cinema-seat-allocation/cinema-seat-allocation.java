class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] reservedSeat: reservedSeats){
            int row = reservedSeat[0];
            int seat = reservedSeat[1];
            if(map.containsKey(row)){
                map.get(row).add(seat);
            } else{
                Set<Integer> seats = new HashSet<>();
                seats.add(seat);
                map.put(row, seats);
            }
        }
        for(int row: map.keySet()){
            boolean first = true, second = true, third = true;
            Set<Integer> seats = map.get(row);
            if(seats.contains(2) || seats.contains(3) || seats.contains(4) || seats.contains(5)) first = false;
            if(seats.contains(6) || seats.contains(7) || seats.contains(4) || seats.contains(5)) second = false;
            if(seats.contains(6) || seats.contains(7) || seats.contains(8) || seats.contains(9)) third = false;
            if(first && third) ans += 2;
            else if(first || second || third) ans += 1;
        }
        ans += 2 * (n - map.size());
        return ans;
    }
}