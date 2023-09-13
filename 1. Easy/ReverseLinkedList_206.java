public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode q = reverse (head,head.next);

        head.next = null;

        return q;
    }

    public ListNode reverse (ListNode prev, ListNode curr) {
        if (curr.next == null){
            curr.next = prev;
            return curr;
        }
        ListNode next = curr.next;
        curr.next = prev;

        return reverse(curr,next);
    }

}