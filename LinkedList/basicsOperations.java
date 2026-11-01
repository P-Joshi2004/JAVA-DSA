package LinkedList;

public class basicsOperations {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    //Add node at the beginning
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //Add node at last
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //insert into middle
    public static void addInmiddle(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;


    }
    //Remove elements from linked List first element 
    public static int removeFirst() {
    if(head == null) {
        System.out.println("LL is empty");
        return -1;
    }

    if(head == tail) {
        int val = head.data;
        head = tail = null;
        return val;
    }

    int val = head.data;
    head = head.next;

    return val;
}
//Remove element from  linked list last element
public static int removeLast() {

    if(head == null) {
        System.out.println("LL is empty");
        return -1;
    }

    if(head.next == null) {
        int val = head.data;
        head = tail = null;
        return val;
    }

    Node temp = head;

    while(temp.next != tail) {
        temp = temp.next;
    }

    int val = tail.data;

    temp.next = null;
    tail = temp;

    return val;

}
    
    //print our linked list
    public static void printlist(){
        if(head==null){
            System.out.println("Linked list is empty:");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;

        }
        System.out.println();
    }
    public static void main(String args[]){
    
        /*head=new Node(1);
        head.next=new Node(2);
        tail=head.next;*/
        addFirst(1);
        addLast(4);
        addInmiddle(1,2);
        addInmiddle(2,3);
        addLast(5);
        

        printlist();
            System.out.println("Removed element: " + removeFirst());
               System.out.println("Linked List after removeFirst:");
          printlist();
          System.out.println("Removed element: " + removeLast());
               System.out.println("Linked List after removeLast:");
          printlist();
    }

    
}
