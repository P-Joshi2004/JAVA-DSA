package LinkedList;
    
public class swapNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node swapNodess(Node head, int x, int y) {

        // If both keys are same
        if (x == y) {
            return head;
        }

        Node prevX = null;
        Node currX = head;

        // Find node containing x
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null;
        Node currY = head;

        // Find node containing y
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either key is not present
        if (currX == null || currY == null) {
            return head;
        }

        // Change previous nodes' links
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head);

        head = swapNodess(head, 2, 4);

        System.out.println("After Swapping:");
        printList(head);
    }
}

