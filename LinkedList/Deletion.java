package LinkedList;

import java.util.Scanner;

public class Deletion {
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
    public void insert_end(int n)
    {
        Node newnode  = new Node(n);
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
            curr=curr.next;}
    }
public void deletion(int pos)
{
    Node temp=head;
    if(head==null)
        return;
    if(pos==0)
    {
        head=head.next;
        return;
    }
    //any other pos except first
    for(int i=0;temp!=null && i<pos-1;i++)
    {
        temp=temp.next;
    }
    if(temp==null && temp.next==null)
        return;
    temp.next=temp.next.next;

}
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Deletion obj = new Deletion();
        obj.insert_end(1);
        obj.insert_end(4);
        obj.insert_end(6);
        obj.insert_end(2);
        obj.insert_end(9);
        System.out.println("List is ");
        obj.display();
        System.out.println("Enter position to delete from");
        int x=ob.nextInt();
        Node t= obj.head;;
        for(int i=0;i<x-1;i++)
            t=t.next;
        obj.deletion(x);
        System.out.println("After deletion ");
        obj.display();
    }
}
