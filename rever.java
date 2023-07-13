class Rever
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next= null;
        }
    }
    //to implement deletion of node in linked list
    public void inserte(int newData)
    {
        Node newNode = new Node(newData);
        if(head==null)
        {
            head = new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;

        }
        temp.next=newNode;
        return;
}
public void print()
{
    Node current = head;
    while(current!=null)
    {
        System.out.print(current.data+" ");
    current=current.next;
    }
}
//reversal of string
public void reverse()
{
    Node curr = head;
    Node prev= null;
    Node nextp = null;
    while(curr!=null)
    {
        nextp = curr.next;
        curr.next = prev;
        prev= curr;
        curr = nextp;
    }
    head = prev;
    return;
}
public static void main(String[] args) {
    Rever obj = new Rever();
    obj.inserte(1);
    obj.inserte(2);
    obj.inserte(3);
    obj.inserte(4);
    System.out.print("Linked list :");
    obj.print();
    System.out.println();
    System.out.print("Linked list after reversal : ");
    obj.reverse();
    obj.print();
    System.out.println();
}}