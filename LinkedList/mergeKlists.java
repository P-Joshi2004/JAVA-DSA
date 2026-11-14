

package LinkedList;

public class mergeKlists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted linked lists
    public static Node mergeTwoLists(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }

    // Merge K sorted linked lists
    public static Node mergeKLists(Node[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        while (lists.length > 1) {

            Node[] mergedLists =
                new Node[(lists.length + 1) / 2];

            int index = 0;

            for (int i = 0; i < lists.length; i += 2) {

                Node head1 = lists[i];

                Node head2 = (i + 1 < lists.length)
                             ? lists[i + 1] : null;

                mergedLists[index++] =
                    mergeTwoLists(head1, head2);
            }

            lists = mergedLists;
        }

        return lists[0];
    }

    // Print linked list
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node[] lists = new Node[3];

        // First linked list
        lists[0] = new Node(1);
        lists[0].next = new Node(3);

        // Second linked list
        lists[1] = new Node(6);
        lists[1].next = new Node(8);

        // Third linked list
        lists[2] = new Node(9);
        lists[2].next = new Node(10);

        Node result = mergeKLists(lists);

        printList(result);
    }
}

    

