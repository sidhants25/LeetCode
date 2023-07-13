public class MergeTwoSortedLists_21 {

    ListNode head = new ListNode();
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        buildList (list1, list2, head);
        return head.next;
        
    }

    private void buildList (ListNode list1, ListNode list2, ListNode curr) {

        if (list1 == null && list2 == null){
            return;
        }

        else if (list1 == null){
            curr.next = new ListNode(list2.val);
            buildList (list1, list2.next, curr.next);
        }

        else if (list2 == null){
            curr.next = new ListNode(list1.val);
            buildList (list1.next, list2, curr.next);
        }

        else {
            if (list1.val > list2.val) {
            curr.next = new ListNode(list2.val);
            buildList (list1, list2.next, curr.next);
            }
            else {
                curr.next = new ListNode(list1.val);
                buildList (list1.next, list2, curr.next);
            }
        }

    }

}
