package LinkedList;
//reversal of linked list using itterative approach
public class ReveIter {
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
            head=new Node(n);
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
    public void reverse()
    {
        Node nextp=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            nextp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextp;
        }
        head=prev;
    }

    public static void main(String[] args) {
        ReveIter obj = new ReveIter();
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
        obj.reverse();
        obj.display();
    }
}
























































