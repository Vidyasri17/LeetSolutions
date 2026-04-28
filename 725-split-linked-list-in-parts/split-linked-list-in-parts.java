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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        ListNode[] ans = new ListNode[k];
        int len = n / k;
        int extra = n % k;
        temp = head;
        for(int i = 0; i < k; i++){
            if(temp == null){
                ans[i] = null;
                continue;
            }
            ans[i] = temp;
            int size = len + (i < extra ? 1 : 0);
            for(int j = 1; j < size; j++){
                temp = temp.next;
            }
            ListNode next = temp.next;
            temp.next = null;
            temp = next;
        }
        return ans;
    }
}