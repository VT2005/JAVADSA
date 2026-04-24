class Solution {
    // Definiton of singly Linked List
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteHead(ListNode head) {
        if (head == null) return null;
        return head.next;
    }
}
