package Trees;

import java.util.Scanner;

public class Traversal{
    static Node root;
    static class Node{
        Node right,left;
        int data;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
public static void main(String[] args) {
       // Scanner ob = new Scanner(System.in);
        Traversal obj = new Traversal();
        root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

obj.inorder(root);
System.out.println();
obj.preorder(root);
System.out.println();
obj.postorder(root);
    }
}
