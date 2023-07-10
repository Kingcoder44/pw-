class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //insertion at end
    public void insertend(int newData)
    {
        Node newNode = new Node(newData);
        if(head == null)
        {
            head = new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp = head;
        while(temp.next!=null)
        temp = temp.next;
        temp.next = newNode;
        return;
    }
    //insertion in beginning
    public void insertbegin(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    //inertion in between
    public void insertAfter(Node prev_Node, int newData){
        if(prev_Node==null)
        {
            System.out.println("Prev node contains null");
            return;

        }
        Node newNode = new Node(newData);
        newNode.next = prev_Node.next;
        prev_Node.next = newNode;
    }

    public void print()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current= current.next;
        }
    }
    public static void main(String[] args) {
    LinkedList llist  = new LinkedList();
    llist.insertend(2);
    llist.insertend(4);
    llist.insertend(8);
    llist.insertend(10);

    System.out.print("After insertion ");
    llist.print();
    System.out.println();
   
    llist.insertbegin(5);
    System.out.print("After insertion in begin ");
    llist.print();
    System.out.println();
    llist.insertAfter(llist.head.next.next, 11);
    System.out.print("After insertion in between ");
    llist.print();
    System.out.println();
    }
}