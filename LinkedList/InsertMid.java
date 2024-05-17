package LinkedList;

public class InsertMid {
    Node head;
    class Node {
        Node next;
        int data;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void insert_end(int n)
    {
        //initializa newnode with data entered
       Node newnode = new Node(n);
        //if ll empty
        if(head==null) {
            head=new Node(n);
            return;}
        //ll not empty
        newnode.next=null;
        Node temp = head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newnode;
    }
    public void InsertionAfter(Node prev_node,int n)
    {
        Node newnode= new Node(n);
        if(head==null)
        {
            head=new Node(n);
            return;
        }
        newnode.next=prev_node.next;
        prev_node.next=newnode;
    }
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        InsertMid obj = new InsertMid();
        obj.insert_end(1);
        obj.insert_end(4);
        obj.insert_end(6);
        obj.insert_end(2);
        obj.insert_end(9);
        System.out.println("List is ");
        obj.display();
        System.out.println();
        System.out.println("After Insertion");
        obj.InsertionAfter(obj.head.next.next,5);
        obj.display();
    }
}
