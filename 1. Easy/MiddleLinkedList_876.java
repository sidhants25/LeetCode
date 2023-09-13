// public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }

public class MiddleLinkedList_876 {

    public ListNode middleNode(ListNode head) {
        
        if (head.next = null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null) {

            if (fast.next.next == null) {
                return slow.next;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;


    }
}