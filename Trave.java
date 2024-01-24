class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class Trave{
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+", ");
            inorder(root.right);
        }
    }
    
    void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+", ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+", ");
        }
    }
    public static void main(String args[])
    {
        Trave obj = new Trave();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
       System.out.println("Inorder ");
       obj.inorder(root);
        System.out.println();
       System.out.println("Preorder ");
       obj.preorder(root);  
       System.out.println();
       System.out.println("Postorder ");
       obj.postorder(root);  
    }
}