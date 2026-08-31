/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int index = 1;
        ListNode prev = head;
        ListNode temp = head.next;
        List<Integer> list = new ArrayList<>();
        while(temp != null && temp.next != null){
            index++;
            if(temp.val > prev.val && temp.val > temp.next.val) list.add(index);
            else if(temp.val < prev.val && temp.val < temp.next.val) list.add(index);
            prev = temp;
            temp = temp.next;
        }
        if(list.size() < 2) return new int[] {-1, -1};
        int minGap = Integer.MAX_VALUE;
        int maxGap = list.get(list.size() - 1) - list.get(0);
        for(int i = 1; i < list.size(); i++){
            int diff = list.get(i) - list.get(i - 1);
            if(diff < minGap) minGap = diff;
        }
        return new int[] {minGap, maxGap};
    }
}