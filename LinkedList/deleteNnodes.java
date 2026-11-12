
package LinkedList;

public class deleteNnodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void deleteNAfterM(Node head, int M, int N) {

        Node curr = head;

        while (curr != null) {

            // Keep M nodes
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null) {
                break;
            }

            // Delete next N nodes
            Node temp = curr.next;

            for (int i = 1; i <= N && temp != null; i++) {
                temp = temp.next;
            }

            // Connect remaining nodes
            curr.next = temp;

            // Move to next remaining node
            curr = temp;
        }
    }

    public static void printList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked List:");
        printList(head);

        int M = 2;
        int N = 2;

        deleteNAfterM(head, M, N);

        System.out.println("After Deletion:");
        printList(head);
    }
}
