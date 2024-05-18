package LinkedList;

public class CycleDtect {

    Node head;
     int f=-1;

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
            curr=curr.next;}
        System.out.print("null");
    }
    public void cdetect()
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        { slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                f=1;
                break;
            }

        }
        if(f==1)
        System.out.print("Cycle Exists ");
        else
            System.out.println("No Cycle exists");
    }
    public static void main(String[] args) {
        CycleDtect obj = new CycleDtect();
        obj.insertEnd(1);
        obj.insertEnd(2);
        obj.insertEnd(3);
        obj.insertEnd(4);
        obj.insertEnd(5);
        obj.insertEnd(6);
        System.out.println("List is ");
        obj.display();
        System.out.println();
        //   to check for cycle detection uncomment this
        //   obj.head.next.next.next.next.next.next = obj.head.next.next;
        obj.cdetect();
    }
}



