class Node {
    int data;
    Node next;

    Node(int data) { this.data = data; }
    Node(int data, Node next) { this.data = data; this.next = next; }
}

class Solution {
    static int length(Node head) {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        System.out.println("Length of the linked list: " + length(head));
    }
}
