class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // Save the remaining list
            curr.next = prev;          // Reverse the current link
            prev = curr;               // Move prev forward
            curr = next;               // Move curr forward
        }

        return prev;
    }
}