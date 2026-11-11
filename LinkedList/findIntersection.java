
package LinkedList;

public class findIntersection {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find intersection
    public static Node getIntersection(Node head1, Node head2) {

        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = head2;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = head1;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void main(String args[]) {

        // Creating the common part
        Node Common = new Node(6);
        Common.next = new Node(7);

        // First linked list
        Node head1 = new Node(4);
        head1.next = new Node(5);
        head1.next.next = Common;

        // Second linked list
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = Common;

        // Finding intersection
        Node intersection = getIntersection(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection point: " + intersection.data);
        } else {
            System.out.println("No intersection found");
        }
    }
}
