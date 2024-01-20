package subhankar.LC75;

//2130. Maximum Twin Sum of a Linked List
public class LC7530 {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, prev = null, temp = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        int result = 0;
        while(slow != null) {
            int tempResult = prev.val + slow.val;
            if(result <  tempResult ) {
                result = tempResult;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return result;
    }
}
