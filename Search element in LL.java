class Solution {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
        Node(int data, Node next) { this.data = data; this.next = next; }
    }

    public boolean search(Node head, int target) {
        Node cur = head;
        while (cur != null) {
            if (cur.data == target) return true;
            cur = cur.next;
        }
        return false;
    }
}
