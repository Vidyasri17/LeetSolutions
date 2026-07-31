class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int n = tickets.length;
        for(int i = 0; i < n; i++){
            if(i != k) queue.offer(tickets[i]);
            else queue.offer(-tickets[i]);
        }
        int time = 0;
        while(!queue.isEmpty()){
            time++;
            int ele = queue.poll();
            if(ele < 0){
                ele++;
                if(ele == 0) return time;
            }
            else ele--;
            if(ele != 0) queue.offer(ele);
        }
        return time;
    }
}