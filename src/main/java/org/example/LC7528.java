package org.example;

//LC 328. Odd Even Linked List
public class LC7528 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode seven=even;
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            even.next=odd.next.next;
            odd=odd.next;
            even=even.next;
        }
        //to make the end of odd to point to even
        odd.next=seven;

        return head;

    }
}
