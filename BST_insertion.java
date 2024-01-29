import java.util.Scanner;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        right=left=null;
    }
}
class BST_insertion
{
    Node root;
    BST_insertion()
    {
        root=null;
    }
    BST_insertion(int data)
    {
        root=new Node(data);
    }
    void insert(int data)
    {
        root=insertEle(root,data);
    }
    Node insertEle(Node root, int data)
    {
        if(root==null)
        {
        root=new Node(data);
        return root;
        }
        else if(data<root.data)
         insertEle(root.left,data);
        else
     insertEle(root.right,data);

    
    return root;

    }
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+", ");
            inorder(root.right);
        }
    }
    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        BST_insertion obj = new BST_insertion();
        System.out.println("Enter number of nodes");
        int s = ob.nextInt();
        for(int i=1;i<=s;i++)
            obj.insert(ob.nextInt());
        System.out.println("Traversal");
        obj.inorder(obj.root);    
    }
}