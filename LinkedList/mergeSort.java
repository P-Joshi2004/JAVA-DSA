
package LinkedList;

public class mergeSort {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1. Find the middle node
    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // 2. Merge two sorted linked lists
    public static Node merge(Node head1, Node head2) {

        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        // Attach remaining nodes
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    // 3. Divide and sort the linked list
    public static Node sortList(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node mid = getMid(head);

        // Divide into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Sort left half
        Node newLeft = sortList(head);

        // Sort right half
        Node newRight = sortList(rightHead);

        // Merge both sorted halves
        return merge(newLeft, newRight);
    }

    // 4. Print linked list
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(10);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted Linked List:");
        printList(head);
    }
}
