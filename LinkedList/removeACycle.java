package LinkedList;

public class removeACycle {

    // Node class
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

    // Add node at the end
    public static void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Detect cycle
    public static boolean isCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Remove cycle
    public static void removeCycle() {

        // Step 1: Detect cycle
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // If no cycle exists
        if (cycle == false) {
            return;
        }

        // Step 2: Find starting point of cycle
        slow = head;

        while (slow != fast) {

            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find last node of cycle
        Node temp = slow;

        while (temp.next != slow) {

            temp = temp.next;
        }

        // Step 4: Break the cycle
        temp.next = null;

        // Update tail
        tail = temp;
    }

    // Print linked list
    public static void printList() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Create linked list
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        // Create a cycle:
        // Last node points to node 2
        tail.next = head.next;

        System.out.println("Cycle detected: " + isCycle());

        // Remove cycle
        removeCycle();

        System.out.println("Cycle detected after removal: " + isCycle());

        // Print linked list
        System.out.println("Linked List after removing cycle:");
        printList();
    }
}

