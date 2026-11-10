package LinkedList;
public class Zigzag {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Add node at the end
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
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

    // Zig Zag Linked List
    public static void zigZag() {

        // STEP 1: Find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Divide into two halves
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;

        // STEP 3: Reverse second half
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // STEP 4: Merge alternately
        Node nextL, nextR;

        while (left != null && right != null) {

            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);

        System.out.println("Original Linked List:");
        printList();

        zigZag();

        System.out.println("Zig Zag Linked List:");
        printList();
    }
}

    

