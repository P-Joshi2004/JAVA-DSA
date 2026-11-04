package LinkedList;

public class IterativeSearch {
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
    //add element in your linked list
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //add at last
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    //add in middle
public static void addInmiddle(int data,int idx){
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;

    }
    newNode.next=temp.next;
    temp.next=newNode;
}
//remove first element
public static int  removeFirst(){
    if(head==null){
        System.out.print("LL is empty");
        return 1;
    }
    if(head==tail){
        int val=head.data;
        head=tail=null;
        return val;
    }
    int val=head.data;
    head=head.next;
    return val;
}
    //Remove last
    public static int removeLast(){
        if(head==null){
            System.out.print("LL is empty");
            return -1;
    
        }
        if(head==null){
        int val=head.data;
        head=tail=null;
        return val;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        int val=tail.data;
        temp.next=null;
        tail=temp;
        return val;
    }
    //search key in linkedlist
    public static  int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=tail){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    //print linkedlist
    public static void printList(){
    if(head==null){
        System.out.println("Linked List is empty");
}
Node temp=head;
while(temp!=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
}
System.out.println();
    }
    public static void main (String args[]){
      addFirst(10);
        addLast(40);
        addInmiddle(20,1);
        addInmiddle(30,2);
        addLast(50);
        

        printList();
            System.out.println("Removed element: " + removeFirst());
               System.out.println("Linked List after removeFirst:");
          printList();
          System.out.println("Removed element: " + removeLast());
               System.out.println("Linked List after removeLast:");
          printList();  
          System.out.println("Element found at index:"+itrSearch(30));
    }


    }
    
