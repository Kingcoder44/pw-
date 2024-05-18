package LinkedList;

public class LLmiddle {

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
                curr=curr.next;}
            System.out.print("null");
        }
        public void middle()
        {
            Node slow=head,fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.print("Middle node = "+slow.data);
        }
        public static void main(String[] args) {
            LLmiddle obj = new LLmiddle();
            obj.insertEnd(1);
            obj.insertEnd(2);
            obj.insertEnd(3);
            obj.insertEnd(4);
            obj.insertEnd(5);
//            obj.insertEnd(6);
            System.out.println("List is ");
            obj.display();
            System.out.println();
            obj.middle();
        }
    }



