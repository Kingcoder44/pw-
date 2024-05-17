package LinkedList;

public class InsertionBegin {

Node head;
    class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void Insert_Beg(int n)
    {
        //initialization of newnode with value
        Node newnode = new Node(n);
        //check if empty
        if(head==null)
        {
            head=new Node(n);
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        InsertionBegin obj = new InsertionBegin();
        obj.Insert_Beg(4);
        obj.Insert_Beg(3);
        obj.Insert_Beg(2);
        obj.Insert_Beg(1);
        System.out.println("List is ");
        obj.display();
        System.out.println();
        System.out.println("After Insertion");
        obj.Insert_Beg(5);
        obj.display();
    }
}
