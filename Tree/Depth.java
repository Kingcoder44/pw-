package Trees;

public class Depth {
    static Node root;
    class Node{
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    //tp find the depth of the tree
    public int depth(Node root)
    {
        if (root != null)
        {
            int ldepth = depth(root.left);
            int rdepth = depth(root.right);
            return Math.max(ldepth,rdepth)+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Depth obj = new Depth();
        root=obj.new Node(3);
        root.left=obj.new Node(9);
        root.right=obj.new Node(20);
        root.right.left=obj.new Node(15);
        root.right.right=obj.new Node(7);
        System.out.println(obj.depth(root));
    }
}
