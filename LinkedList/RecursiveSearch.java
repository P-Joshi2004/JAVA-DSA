
package LinkedList;

public class RecursiveSearch {

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

    // Add element in your linked list (First)
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at last
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add in middle
    public static void addInmiddle(int data, int idx) {

        if (idx < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;

        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Remove first element
    public static int removeFirst() {

        if (head == null) {
            System.out.println("LL is empty");
            return -1;
        }

        int val = head.data;

        if (head == tail) {
            head = tail = null;
            return val;
        }

        head = head.next;
        return val;
    }

    // Remove last element
    public static int removeLast() {

        if (head == null) {
            System.out.println("LL is empty");
            return -1;
        }

        if (head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;

        return val;
    }

    // Search key in linked list (Recursive Search)
    public static int helper(Node head, int key) {

        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    // Recursive Search
    public static int RecursiveSearch(int key) {
        return helper(head, key);
    }

    // Print linked list
    public static void printList() {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String args[]) {

        addFirst(10);
        addLast(40);
        addInmiddle(20, 1);
        addInmiddle(30, 2);
        addLast(50);

        printList();

        System.out.println("Removed element: " + removeFirst());

        System.out.println("Linked List after removeFirst:");
        printList();

        System.out.println("Removed element: " + removeLast());

        System.out.println("Linked List after removeLast:");
        printList();

        System.out.println("Element found at index: " + RecursiveSearch(30));
    }
}
