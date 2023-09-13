public class MergeKSortedLists_23 {
    private ListNode ans;
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        
        ans = null;

        buildNode(lists, ans);

        return ans;
    }

    public void buildNode(ListNode[] lists, ListNode sol) {
        ListNode small = null;
        int smallInd = -1;
        int min = Integer.MAX_VALUE;
        boolean allNull = true;

        for (int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];

            if (curr != null) {
                allNull = false;

                if (curr.val < min) {
                    small = curr;
                    min = curr.val;
                    smallInd = i;
                }
            }
        }

        if (allNull) {
            return;
        }

        ListNode replacement = small.next;
        lists[smallInd] = replacement;

        ListNode next;

        if (sol == null) {
            ans = small;
            next = ans;
        }
        else {
            sol.next = small;
            next = sol.next;
        }
        buildNode(lists,next);
        
    }
}