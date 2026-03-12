/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    // ListNode* rotateRight(ListNode* head, int k) {
        
    //     if(head == NULL || head->next == NULL) return head;
        
    //     while(k-- > 0){
    //         ListNode* temp = head;
    //         while(temp->next->next != NULL) temp = temp->next;
    //         ListNode* last  = temp->next;
    //         temp->next = NULL;
    //         last->next = head;
    //         head = last;
    //     }
    //     return head;
    // }
    ListNode* rotateRight(ListNode* head, int k) {
        
        if(head == nullptr || head->next == nullptr) return head;
        int n = 1;
        ListNode* tail = head;
        while(tail->next != nullptr){
            tail = tail->next;
            n++;
        }
        k %= n;
        tail->next = head;
        int steps = n - k;
        ListNode* newTail = head;
        while(steps-- > 1){
            newTail = newTail->next;
        }
        ListNode* newHead = newTail->next;
        newTail->next = nullptr;
        return newHead;
    }
};