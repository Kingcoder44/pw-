package LinkedList;
//reversal of linked list using recursive approach
public class RevRec {
    Node head;
    class Node {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void insertEnd(int n)
    {
        Node newnode= new Node(n);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=null;
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newnode;
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {System.out.print(curr.data+" -> ");
            curr=curr.next;} System.out.print("null");
    }
    public Node reverse(Node head)
    {
        if(head==null||head.next==null)
            return head;
        Node rest= reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rest;
    }

    public static void main(String[] args) {
        RevRec obj = new RevRec();
        obj.insertEnd(1);
        obj.insertEnd(2);
        obj.insertEnd(3);
        obj.insertEnd(4);
        obj.insertEnd(5);
        obj.insertEnd(6);
        System.out.println("List is ");
        obj.display();
        System.out.println();

        System.out.println("After Reversal");
        obj.head=obj.reverse(obj.head);
        obj.display();
    }
}

