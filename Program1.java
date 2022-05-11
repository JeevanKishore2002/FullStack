Merge Two Sorted Lists
 
Merge Two Sorted ListsYou are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
return list1 != null ? list1 : list2;
ListNode dummy = new ListNode(-1);
ListNode c1 = list1, c2 = list2, prev = dummy;
while(c1 != null && c2 != null){
if(c1.val < c2.val){
prev.next = c1;
c1 = c1.next;
}else{
prev.next = c2;
c2 = c2.next;
}
prev = prev.next;
}
if(c1 != null) prev.next = c1;
if(c2 != null) prev.next = c2;
return dummy.next;
        
    }
}
________________________________________________________________________________

