package LinkedList;

import java.util.*;
public class InsertionEnd {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    //to insert at the end of node
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
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {System.out.print(curr.data+" -> ");
            curr=curr.next;}
    }

    public static void main(String[] args) {
        InsertionEnd obj = new InsertionEnd();
        obj.insert_end(1);
        obj.insert_end(4);
        obj.insert_end(6);
        obj.insert_end(2);
        obj.insert_end(9);
        System.out.println("List is ");
        obj.display();
    }
}
