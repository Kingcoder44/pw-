import java.util.Scanner;
//make node class for nodes of tree
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
    //initialize root 
    BST_insertion()
    {
        root=null;
    }
    BST_insertion(int data)
    {
        root=new Node(data);
    }
    //to insert element
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
        //to insert according to BST criteria
        else if(data<root.data)
       root.left= insertEle(root.left,data);
        else
     root.right=insertEle(root.right,data);

    
    return root;

    }
    //traversal
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+", ");
            inorder(root.right);
        }
    }
    //to search for an element
    Node search(Node root, int data)
    {
        if(root==null || root.data==data)
        return root;
        
        if(data<root.data)
        return search(root.left,data);
        else 
        return search(root.right, data);
    }
    //to find inorder predecessor for deletion of node with two children
    Node maxVal(Node root)
    {
        Node curr=root;
        while(curr!=null)
        curr=curr.right;
        return  curr;
    }
    //to delete a node
    Node delete(Node root, int data)
    {
       
        if(root==null)
        return root;
        if(data<root.data)
        root.left= delete(root.left,data);
        else if(data>root.data)
        root.right= delete(root.right,data);
        else{
             //no child or 1 child
             if(root.right==null)
             return root.left;
             else if(root.left==null)
             return root.right;
             //for 2 child
             else{
                root.data=maxVal(root.left).data;
                root.left=delete(root.left,data);
                         }
        }
        return root;
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
        System.out.println("Enter element to search");
        if(obj.search(obj.root, ob.nextInt())==null)
        System.out.println("Not found");
        else
        System.out.println("Element found");
        obj.root=obj.delete(obj.root,70);
        obj.inorder(obj.root);
    }
}
