package Trees;

public class Symmetric {
    static Node root;
    class Node{
        Node left,right;
        int data;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    public boolean isSymmetric(Node root)
    {
        return isMirror(root,root);
    }
    public boolean isMirror(Node r1, Node r2)
    {
        if(r1==null & r2==null)
            return true;
        else if(r1==null || r2==null)
            return false;
        else
            return(r1.data==r2.data && isMirror(r1.left,r2.right) && isMirror(r1.right,r2.left));
    }
    public static void main(String[] args) {
        Symmetric obj = new Symmetric();
        root=obj.new Node(1);
        root.left=obj.new Node(2);
        root.right=obj.new Node(2);
        root.right.left=obj.new Node(4);
        root.right.right=obj.new Node(3);
        root.left.left=obj.new Node(3);
        root.left.right=obj.new Node(4);
        System.out.println("Is tree symmetric true/false: "+(obj.isSymmetric(root)?"True":"False"));
    }
}
