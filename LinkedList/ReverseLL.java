
package LinkedList;

public class ReverseLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add node at the beginning
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add node at the last
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Insert node in the middle
    public static void addInmiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    // Print Linked List
    public static void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Reverse Linked List
    public static void reverse() {

        Node prev = null;
        Node curr = head;
        Node next;

        tail = head;

        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        head = prev;
    }

    public static void main(String args[]) {

        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        System.out.println("Original Linked List:");
        print();

        reverse();

        System.out.println("Reversed Linked List:");
        print();
    }
}
