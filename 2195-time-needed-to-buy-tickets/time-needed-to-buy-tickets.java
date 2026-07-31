class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        int n = tickets.length;
        for(int i = 0; i < n; i++){
            queue.offer(i);
        }
        int time = 0;
        while(!queue.isEmpty()){
            int idx = queue.poll();
            time++;
            tickets[idx]--;
            if(tickets[idx] > 0){
                queue.offer(idx);
            }
            if(idx == k && tickets[k] == 0) return time;
        }
        return time;
    }
}