package org.example;

//206. Reverse Linked List
public class LC7529 {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prevNode;
            prevNode = head;
            head = next;
        }
        return prevNode;
    }

}
