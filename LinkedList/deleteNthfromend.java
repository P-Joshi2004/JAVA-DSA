package LinkedList;

public class deleteNthfromend {
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
    //code to delte nth from from the end
    public static void removeNthNodefromtheEnd(int n){
        Node dummy=new Node(-1);
        dummy.next=head;

        Node fast=dummy;
        Node slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        Node target=slow.next;
        slow.next=target.next;
        head=dummy.next;
        if(target==tail){
            tail=slow==dummy?null:slow;
        }

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
      removeNthNodefromtheEnd(2);

        System.out.println("After removing 2nd node from end:");
        printlist();
            
          
    }

    
}

    

